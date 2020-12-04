package com.cool.photoalbum.ui.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Scroller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseActivity;
import com.cool.photoalbum.model.domain.IBasePhotoInfo;
import com.cool.photoalbum.ui.adapter.BrowseAdapter;
import com.cool.photoalbum.ui.adapter.VideoPlayerAdapter;
import com.cool.photoalbum.utils.Constants;
import com.cool.photoalbum.utils.SizeUtils;
import com.github.chrisbanes.photoview.PhotoView;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.tencent.liteav.txcvodplayer.TXCVodVideoView;
import com.tencent.rtmp.ITXVodPlayListener;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.TXVodPlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;

import java.time.Year;
import java.util.List;

import static com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_BEGIN;
import static com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_LOADING;
import static com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_LOADING_END;

public class VideoPlayerActivity extends AppCompatActivity implements ITXVodPlayListener {
    private ViewPager2 mViewPager;
    private VideoPlayerAdapter mAdapter;
    private int mCurrentPosition;
    private List<IBasePhotoInfo> dataList;
    private TXCloudVideoView mVideoView;
    private TXVodPlayer mVodPlayer;
    private boolean isStartPlayer; //是否开始播放
    private ProgressBar progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_video_player);

        initView();

        initPresenter();

        initEvent();
    }

    protected void initView() {

        mViewPager = findViewById(R.id.video_player_viewpager);
        mViewPager.setOrientation(ViewPager2.ORIENTATION_VERTICAL);

        mAdapter = new VideoPlayerAdapter();
        mViewPager.setAdapter(mAdapter);

        Intent intent = getIntent();
        dataList = intent.getParcelableArrayListExtra(Constants.KEY_FEED_BEAN_LIST);
        mCurrentPosition = intent.getIntExtra(Constants.KEY_FEED_BEAN_LIST_POSITION, 0);
        mAdapter.setList(dataList);

        mViewPager.setCurrentItem(mCurrentPosition, false);

        progressBar = findViewById(R.id.player_progress_bar);

        // 初始化播放器
        mVideoView = new TXCloudVideoView(this);

        mVodPlayer = new TXVodPlayer(this);
        //关键 player 对象与界面 view
        mVodPlayer.setPlayerView(mVideoView);
        mVodPlayer.setAutoPlay(true);
        mVodPlayer.setLoop(true);
        mVodPlayer.setRenderMode(TXLiveConstants.RENDER_MODE_FULL_FILL_SCREEN);

        mVodPlayer.setVodListener((ITXVodPlayListener) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        videoPlayEnd();
    }

    protected void initPresenter() {
        View mIconBack = findViewById(R.id.browse_icon_back);
        // 返回上一个界面
        mIconBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoPlayEnd();
                finish();
            }
        });
    }

    protected void initEvent() {
        mViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                if (isStartPlayer == false){
                    isStartPlayer = true;
                    startPlayerVideo();
                }
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                isStartPlayer = true;
                mCurrentPosition = position;
                startPlayerVideo();
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }

    private void startPlayerVideo(){
        progressBar.setVisibility(View.VISIBLE);

        IBasePhotoInfo info = dataList.get(mCurrentPosition);

        if ( mVideoView != null && mVideoView.getParent() != null ){
            //跳转到指定的位置
            ViewGroup parent = (ViewGroup)mVideoView.getParent();
            if (parent != null) {
                videoPlayEnd();
                parent.removeView(mVideoView);
            }
        }

        // 如果是分区头部，不播放
        if (info.isHeader()){
            progressBar.setVisibility(View.GONE);
            return;
        }

        // 创建mViewView
        View itemView = mViewPager.findViewWithTag(mViewPager.getCurrentItem());
        if (itemView != null) {

            FrameLayout frameLayout = itemView.findViewById(R.id.item_play_container);
            frameLayout.addView(mVideoView);
        }

        mVodPlayer.startPlay(info.videoUrl());

    }

    private void videoPlayEnd(){
        if (mVodPlayer != null) {
            mVodPlayer.stopPlay(true); // true 代表清除最后一帧画面
        }
        if (mVideoView != null) {
            mVideoView.onDestroy();
        }
    }

    @Override
    public void onPlayEvent(TXVodPlayer txVodPlayer, int event, Bundle bundle) {

        if (event == PLAY_EVT_PLAY_BEGIN) { // 开始播放
            progressBar.setVisibility(View.GONE);

        } else if (event == PLAY_EVT_PLAY_LOADING) { // 中间出现loading
            progressBar.setVisibility(View.VISIBLE);

        } else if (event == PLAY_EVT_VOD_LOADING_END) { // 中间出现的loading结束
            progressBar.setVisibility(View.GONE);
        }

    }

    @Override
    public void onNetStatus(TXVodPlayer txVodPlayer, Bundle bundle) {

    }
}
