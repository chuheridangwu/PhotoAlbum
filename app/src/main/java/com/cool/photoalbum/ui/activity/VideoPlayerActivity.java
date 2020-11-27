package com.cool.photoalbum.ui.activity;

import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseActivity;
import com.cool.photoalbum.model.domain.IBasePhotoInfo;
import com.cool.photoalbum.ui.adapter.BrowseAdapter;
import com.cool.photoalbum.ui.adapter.VideoPlayerAdapter;
import com.cool.photoalbum.utils.Constants;
import com.cool.photoalbum.utils.SizeUtils;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

import java.util.List;

public class VideoPlayerActivity extends BaseActivity {
    private RecyclerView mRecyclerView;
    private VideoPlayerAdapter mAdapter;
    private int mCurrentPosition;
    private ImageView mImageView;
    private List<IBasePhotoInfo> dataList;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_video_player;
    }

    @Override
    protected void initView() {

        mImageView = findViewById(R.id.video_player_img);
        mRecyclerView= findViewById(R.id.video_player_recycler);

        // 设置分页
        PagerSnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(mRecyclerView);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manager);

        mRecyclerView.setAdapter(mAdapter);

        mAdapter = new VideoPlayerAdapter();
        Intent intent = getIntent();
        dataList = intent.getParcelableArrayListExtra(Constants.KEY_FEED_BEAN_LIST);
        mCurrentPosition = intent.getIntExtra(Constants.KEY_FEED_BEAN_LIST_POSITION,0);
        mAdapter.setList(dataList);

        IBasePhotoInfo info = dataList.get(mCurrentPosition);
        Glide.with(this).load(info.smallUrl()).into(mImageView);
    }

    @Override
    protected void release() {

    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initEvent() {
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_INDICATOR_END){
                    int index = ((LinearLayoutManager)recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
                    IBasePhotoInfo info = dataList.get(mCurrentPosition);
                    Glide.with(getBaseContext()).load(info.smallUrl()).into(mImageView);
                }
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
    }

}
