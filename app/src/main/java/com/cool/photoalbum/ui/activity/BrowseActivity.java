package com.cool.photoalbum.ui.activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.cool.photoalbum.R;
import com.cool.photoalbum.model.domain.IBasePhotoInfo;
import com.cool.photoalbum.model.domain.PhotoList;
import com.cool.photoalbum.model.domain.SearchResult;
import com.cool.photoalbum.presenter.IPhotoListPresenter;
import com.cool.photoalbum.presenter.impl.IPhotoListImpl;
import com.cool.photoalbum.presenter.impl.ISavePhotoImpl;
import com.cool.photoalbum.presenter.impl.ISearchPhotoImpl;
import com.cool.photoalbum.ui.adapter.BrowseAdapter;
import com.cool.photoalbum.utils.Constants;
import com.cool.photoalbum.utils.DonwloadSaveImg;
import com.cool.photoalbum.utils.PushActivityUtil;
import com.cool.photoalbum.utils.ToastUtils;
import com.cool.photoalbum.viewCallback.IPhotoListCallback;
import com.cool.photoalbum.viewCallback.ISearchViewCallback;

import java.util.List;

public class BrowseActivity extends AppCompatActivity implements IPhotoListCallback, ISearchViewCallback {

    private RecyclerView mRecyclerView;
    private BrowseAdapter mAdapter;
    private ImageView mIconLike;

    private IPhotoListPresenter mListPresenter;
    private int mCategoryId;
    private ISearchPhotoImpl mSearchPresenter;
    private ISavePhotoImpl mSavePresenter;
    private int mCurrentPosition;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_browse);

        initView();

        initPresenter();

        initEvent();
    }

    private void initPresenter() {

        mListPresenter = new  IPhotoListImpl();
        mListPresenter.registerViewCallback(this);

        mSearchPresenter = new ISearchPhotoImpl();
        mSearchPresenter.registerViewCallback(this);

        mSavePresenter = new ISavePhotoImpl();

        // 滚动到对应位置时加载数据
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                // 最后一个即将显示的视图位置
                mCurrentPosition = ((LinearLayoutManager)recyclerView.getLayoutManager()).findLastVisibleItemPosition();

                isFollow();

                if (newState == RecyclerView.SCROLL_STATE_IDLE && mCurrentPosition >= mAdapter.getData().size() - 5){ //当停止滚动时
                    if (PushActivityUtil.photoActivityType == PushActivityUtil.PhotoActivityType.PHOTO_ACTIVITY_TYPE_CATEGORY){
                        mListPresenter.loaderMore(mCategoryId);
                    }else {
                        String keyboard = getIntent().getStringExtra(Constants.KEY_FEED_BEAN_LIST_KEYBOARD);
                        mSearchPresenter.loadMoreResult(keyboard);
                    }
                }
            }
        });
    }

    private void initEvent() {
        View mIconBack = findViewById(R.id.browse_icon_back);
        mIconLike = findViewById(R.id.browse_icon_like_img);
        View mIconDownload = findViewById(R.id.browse_icon_download);

        // 返回上一个界面
        mIconBack.setOnClickListener(v -> finish());

        // 关注和取消关注
        mIconLike.setOnClickListener(v -> {

            // 保存数据
            int position = ((LinearLayoutManager)mRecyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
            IBasePhotoInfo bean = mAdapter.getData().get(position);
            if (isFollow()){
                mIconLike.setImageResource(R.mipmap.browse_like_normal);
                mSavePresenter.removePhoto(bean);
            }else {
                mIconLike.setImageResource(R.mipmap.browse_like_selecte);
                mSavePresenter.savePhotoList(bean);
            }
        });

        // 下载图片
        mIconDownload.setOnClickListener(v -> {
            int position = ((LinearLayoutManager)mRecyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
            IBasePhotoInfo bean = mAdapter.getData().get(position);

            // 保存下载图片
            mSavePresenter.saveDownloadPhotoList(bean);
            // 下载
            DonwloadSaveImg.donwloadImg(BrowseActivity.this,bean.smallUrl());//iPath

        });

        isFollow();
    }

    // 判断是否已经关注了，已经收藏了就不允许再次点击了
    private boolean isFollow(){
        List<IBasePhotoInfo> photos = mSavePresenter.getPhotoList();
        IBasePhotoInfo photoInfo = mAdapter.getData().get(mCurrentPosition);

        for (IBasePhotoInfo photo : photos) {
            if (photo.smallUrl().equals(photoInfo.smallUrl())){
                mIconLike.setImageResource(R.mipmap.browse_like_selecte);
                return true;
            }
        }
        mIconLike.setImageResource(R.mipmap.browse_like_normal);
        return false;
    }

    private void initView() {

        mRecyclerView= findViewById(R.id.browse_recycler_view);

        // 设置分页
        PagerSnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(mRecyclerView);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(manager);

        mAdapter = new BrowseAdapter();
        mRecyclerView.setAdapter(mAdapter);

        Intent intent = getIntent();
        List<IBasePhotoInfo> list = intent.getParcelableArrayListExtra(Constants.KEY_FEED_BEAN_LIST);
        mCategoryId = intent.getIntExtra(Constants.KEY_FEED_BEAN_LIST_CATEGORY_ID,0);
        mCurrentPosition = intent.getIntExtra(Constants.KEY_FEED_BEAN_LIST_POSITION,0);
        mAdapter.setList(list);
        mRecyclerView.scrollToPosition(mCurrentPosition);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mListPresenter != null) {
            mListPresenter.unregisterViewCallback(this);
        }
        if (mSearchPresenter != null) {
            mSearchPresenter.unregisterViewCallback(this);
        }
    }

    @Override
    public void onLoadMoreError() {

    }

    @Override
    public void onLoadMoreEmpty() {
        ToastUtils.showToast("没有更多数据了");
    }

    @Override
    public void onLoadMoreLoaded(PhotoList contents) {
        mAdapter.addData(contents.getFeeds());
    }

    @Override
    public void onContentLoaded(PhotoList contents) {

    }

    @Override
    public void onLoadMoreLoaded(SearchResult contents) {
        mAdapter.addData(contents.getItems());
    }

    @Override
    public void onContentLoaded(SearchResult contents) {

    }

    @Override
    public int getStartPosition() {
        return mAdapter.getData().size();
    }

    @Override
    public void onError() {

    }

    @Override
    public void onLoading() {

    }

    @Override
    public void onEmpty() {

    }
}
