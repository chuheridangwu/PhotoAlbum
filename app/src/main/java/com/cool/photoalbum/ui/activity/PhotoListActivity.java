package com.cool.photoalbum.ui.activity;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseActivity;
import com.cool.photoalbum.model.domain.PhotoList;
import com.cool.photoalbum.presenter.IPhotoListPresenter;
import com.cool.photoalbum.utils.PresentManager;
import com.cool.photoalbum.viewCallback.IPhotoListCallback;

public class PhotoListActivity extends BaseActivity implements IPhotoListCallback {
    private RecyclerView mList_recycler_view;
    private IPhotoListPresenter mListPresenter;
    private TextView mTitleView;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_photo_list;
    }

    @Override
    protected void initView() {
        mList_recycler_view = findViewById(R.id.category_recycler_view);
        mTitleView = findViewById(R.id.nav_title_view);
        mTitleView.setText("图片");
    }

    @Override
    protected void release() {
        if (mListPresenter != null) {
            mListPresenter.unregisterViewCallback(this);
        }
    }

    @Override
    protected void initPresenter() {
        mListPresenter = PresentManager.getInstance().getmIPhotoListPresenter();
        mListPresenter.registerViewCallback(this);
    }

    @Override
    protected void initEvent() {

    }

    @Override
    public void onLoadMoreError() {

    }

    @Override
    public void onLoadMoreEmpty() {

    }

    @Override
    public void onLoadMoreLoaded(PhotoList contents) {

    }

    @Override
    public void onContentLoaded(PhotoList contents) {
        Log.d("TAG", "onContentLoaded: " + contents.getFeeds().toString());
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
