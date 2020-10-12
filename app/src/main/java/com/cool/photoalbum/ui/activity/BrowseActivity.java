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

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

public class BrowseActivity extends AppCompatActivity implements IPhotoListCallback, ISearchViewCallback {

    private static int REQUEST_PERMISSION_CODE = 1;

    private RecyclerView mRecyclerView;
    private BrowseAdapter mAdapter;
    private View mIconBack;
    private ImageView mIconLike;
    private View mIconShare;
    private View mIconDownload;
    private ArrayList<IBasePhotoInfo> mDataList;

    private IPhotoListPresenter mListPresenter;
    private int mCategoryId;
    private ISearchPhotoImpl mSearchPresenter;
    private ISavePhotoImpl mSavePresenter;


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
                int lastPosition = ((LinearLayoutManager)recyclerView.getLayoutManager()).findLastVisibleItemPosition();
                if (newState == RecyclerView.SCROLL_STATE_IDLE && lastPosition >= mDataList.size() - 5){ //当停止滚动时
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
        mIconBack = findViewById(R.id.browse_icon_back);
        mIconLike = findViewById(R.id.browse_icon_like_img);
        mIconShare = findViewById(R.id.browse_icon_share);
        mIconDownload = findViewById(R.id.browse_icon_download);

        mIconBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mIconLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIconLike.setBackgroundResource(R.mipmap.browse_like_selecte);
                mIconLike.setScaleType(ImageView.ScaleType.FIT_CENTER);
                // 保存数据
                int position = ((LinearLayoutManager)mRecyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
                IBasePhotoInfo bean = mAdapter.getData().get(position);
                mSavePresenter.savePhotoList(bean);
            }
        });

        mIconShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = ((LinearLayoutManager)mRecyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
                IBasePhotoInfo bean = mAdapter.getData().get(position);

                // 调用系统分享

                /** * 分享图片 */
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("image/png");
                try {
                    URL url = new URL(bean.smallUrl());
                    intent.putExtra(Intent.EXTRA_STREAM, url.toURI());
                } catch (MalformedURLException | URISyntaxException e) {
                    e.printStackTrace();
                }
                startActivity(Intent.createChooser(intent,"title"));
            }
        });

        mIconDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = ((LinearLayoutManager)mRecyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
                IBasePhotoInfo bean = mAdapter.getData().get(position);
                checkPermission();

                DonwloadSaveImg.donwloadImg(BrowseActivity.this,bean.smallUrl());//iPath

            }
        });

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
        mDataList = intent.getParcelableArrayListExtra(Constants.KEY_FEED_BEAN_LIST);
        mCategoryId = intent.getIntExtra(Constants.KEY_FEED_BEAN_LIST_CATEGORY_ID,0);
        int position = intent.getIntExtra(Constants.KEY_FEED_BEAN_LIST_POSITION,0);
        mAdapter.setList(mDataList);
        mRecyclerView.scrollToPosition(position);
    }


    // 获取相册权限
    private void checkPermission() {
        //检查权限（NEED_PERMISSION）是否被授权 PackageManager.PERMISSION_GRANTED表示同意授权
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            //用户已经拒绝过一次，再次弹出权限申请对话框需要给用户一个解释
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission
                    .WRITE_EXTERNAL_STORAGE)) {
                Toast.makeText(this, "请开通相关权限，否则无法正常使用本应用！", Toast.LENGTH_SHORT).show();
            }
            //申请权限
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_PERMISSION_CODE);
        } else {
            Toast.makeText(this, "授权成功！", Toast.LENGTH_SHORT).show();
        }
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
        mDataList.addAll(contents.getFeeds());
        mAdapter.addData(contents.getFeeds());
    }

    @Override
    public void onContentLoaded(PhotoList contents) {

    }

    @Override
    public void onLoadMoreLoaded(SearchResult contents) {
        mDataList.addAll(contents.getItems());
        mAdapter.addData(contents.getItems());
    }

    @Override
    public void onContentLoaded(SearchResult contents) {

    }

    @Override
    public int getStartPosition() {
        return mDataList.size();
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
