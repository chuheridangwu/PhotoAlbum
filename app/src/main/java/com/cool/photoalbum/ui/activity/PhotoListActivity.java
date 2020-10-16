package com.cool.photoalbum.ui.activity;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseActivity;
import com.cool.photoalbum.model.domain.PhotoList;
import com.cool.photoalbum.model.domain.SearchResult;
import com.cool.photoalbum.presenter.IPhotoListPresenter;
import com.cool.photoalbum.presenter.ISearchPresenter;
import com.cool.photoalbum.ui.adapter.PhotoListAdapter;
import com.cool.photoalbum.utils.Constants;
import com.cool.photoalbum.utils.PresentManager;
import com.cool.photoalbum.utils.PushActivityUtil;
import com.cool.photoalbum.utils.SizeUtils;
import com.cool.photoalbum.utils.ToastUtils;
import com.cool.photoalbum.viewCallback.IPhotoListCallback;
import com.cool.photoalbum.viewCallback.ISearchViewCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;

import java.util.ArrayList;
import java.util.List;

public class PhotoListActivity extends BaseActivity implements IPhotoListCallback, ISearchViewCallback {
    private RecyclerView mList_recycler_view;
    private IPhotoListPresenter mListPresenter;
    private TextView mTitleView;
    private PhotoListAdapter mAdapter;
    private SmartRefreshLayout mSmartRefresh;
    private ISearchPresenter mSearchPresenter;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_photo_list;
    }

    @Override
    protected void initView() {
        GridLayoutManager manager = new GridLayoutManager(this,3);
        manager.offsetChildrenVertical(5);
        manager.offsetChildrenHorizontal(5);

        mList_recycler_view = findViewById(R.id.photo_list_recycler);
        mList_recycler_view.setLayoutManager(manager);

        mAdapter = new PhotoListAdapter();
        mAdapter.setAnimationEnable(true);
        mList_recycler_view.setAdapter(mAdapter);
        mList_recycler_view.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.left = SizeUtils.dip2px(getApplicationContext(),3);
                outRect.right = SizeUtils.dip2px(getApplicationContext(),3);
                outRect.bottom = SizeUtils.dip2px(getApplicationContext(),3);
            }
        });

        // 刷新
        mSmartRefresh = findViewById(R.id.photo_list_refresh);

        mTitleView = findViewById(R.id.nav_title_view);

    }

    @Override
    protected void release() {
        if (mListPresenter != null) {
            mListPresenter.unregisterViewCallback(this);
        }

        if (mSearchPresenter != null) {
            mSearchPresenter.unregisterViewCallback(this);
        }
    }

    @Override
    protected void initPresenter() {
        mListPresenter = PresentManager.getInstance().getmIPhotoListPresenter();
        mListPresenter.registerViewCallback(this);

        mSearchPresenter = PresentManager.getInstance().getmSearchPresenter();
        mSearchPresenter.registerViewCallback(this);

        mSmartRefresh.setRefreshFooter(new ClassicsFooter(this));

        // 设置标题
        if (PushActivityUtil.photoActivityType == PushActivityUtil.PhotoActivityType.PHOTO_ACTIVITY_TYPE_CATEGORY){
            String categoryName = getIntent().getStringExtra(Constants.KEY_PHOTO_PAGER_CATEGORY_NAME);
            mTitleView.setText(categoryName);
        }else {
            String keyboard = getIntent().getStringExtra(Constants.KEY_PHOTO_PAGER_KEYBOARD);
            mTitleView.setText(keyboard);
        }
    }

    @Override
    protected void initEvent() {
        mAdapter.addChildClickViewIds(R.id.photo_list_item_img_view);
        mAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter<?, ?> adapter, @NonNull View view, int position) {
                int categoryId = getIntent().getIntExtra(Constants.KEY_PHOTO_PAGER_CATEGORY_ID,1);
                String keyboard = getIntent().getStringExtra(Constants.KEY_PHOTO_PAGER_KEYBOARD);
                PushActivityUtil.toBrowseActivity(getApplicationContext(),mAdapter.getData(),position,categoryId,keyboard);
            }
        });

        mSmartRefresh.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                if (PushActivityUtil.photoActivityType == PushActivityUtil.PhotoActivityType.PHOTO_ACTIVITY_TYPE_CATEGORY){
                    int categoryId = getIntent().getIntExtra(Constants.KEY_PHOTO_PAGER_CATEGORY_ID,1);
                    mListPresenter.loaderMore(categoryId);
                }else {
                    String keyboard = getIntent().getStringExtra(Constants.KEY_PHOTO_PAGER_KEYBOARD);
                    mSearchPresenter.loadMoreResult(keyboard);
                }
            }
        });

        // 返回上一个界面
        ImageView backView = findViewById(R.id.nav_back);
        backView.setVisibility(View.VISIBLE);
        backView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // 返回顶部
        ImageView topArrow = findViewById(R.id.photo_list_top_arrow);
        topArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mList_recycler_view.smoothScrollToPosition(0);
            }
        });
    }

    @Override
    public void onLoadMoreError() {
        if (mSmartRefresh != null) {
            mSmartRefresh.finishLoadMore();
        }
        ToastUtils.showToast("加载更多失败");
    }

    @Override
    public void onLoadMoreEmpty() {
        if (mSmartRefresh != null) {
            mSmartRefresh.finishLoadMore();
        }
        ToastUtils.showToast("没有更多数据了");
    }

    @Override
    public void onLoadMoreLoaded(PhotoList contents) {
        if (mSmartRefresh != null) {
            mSmartRefresh.finishLoadMore();
        }
        mAdapter.addData(addAdData(contents));
    }

    @Override
    public void onContentLoaded(PhotoList contents) {
        mAdapter.setList(addAdData(contents));
    }

    private List<PhotoList.FeedsBean> addAdData(PhotoList contents){
        List<PhotoList.FeedsBean> mData = new ArrayList<>(contents.getFeeds());
        PhotoList.FeedsBean feedsBean = new PhotoList.FeedsBean();
        feedsBean.setHeader(true);
        int position = mData.size() - 3 > 0 ? mData.size() - 3  : 0;
        mData.add(position,feedsBean);
        return mData;
    }

    @Override
    public void onLoadMoreLoaded(SearchResult contents) {
        if (mSmartRefresh != null) {
            mSmartRefresh.finishLoadMore();
        }
        mAdapter.addData(contents.getItems());
    }

    @Override
    public void onContentLoaded(SearchResult contents) {
        mAdapter.setList(contents.getItems());
    }

    @Override
    public int getStartPosition() {
        return 0;
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
