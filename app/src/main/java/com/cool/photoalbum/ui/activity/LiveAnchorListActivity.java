package com.cool.photoalbum.ui.activity;

import android.app.Application;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseActivity;
import com.cool.photoalbum.model.Api;
import com.cool.photoalbum.model.domain.LiveInfo;
import com.cool.photoalbum.model.domain.PhotoList;
import com.cool.photoalbum.model.domain.SearchResult;
import com.cool.photoalbum.model.domain.VideoList;
import com.cool.photoalbum.presenter.IPhotoListPresenter;
import com.cool.photoalbum.presenter.ISearchPresenter;
import com.cool.photoalbum.presenter.IVideoListPresenter;
import com.cool.photoalbum.ui.adapter.PhotoListAdapter;
import com.cool.photoalbum.utils.Constants;
import com.cool.photoalbum.utils.PresentManager;
import com.cool.photoalbum.utils.PushActivityUtil;
import com.cool.photoalbum.utils.SizeUtils;
import com.cool.photoalbum.utils.ToastUtils;
import com.cool.photoalbum.viewCallback.IPhotoListCallback;
import com.cool.photoalbum.viewCallback.ISearchViewCallback;
import com.cool.photoalbum.viewCallback.IVideoListCallBack;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LiveAnchorListActivity extends AppCompatActivity {
    private RecyclerView mList_recycler_view;
    private PhotoListAdapter mAdapter;
    private TextView mTitleView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_list);

        initData();

        initView();

        initEvent();
    }

    private void initView() {
        GridLayoutManager manager = new GridLayoutManager(this, 2);
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
                outRect.left = SizeUtils.dip2px(getApplicationContext(), 3);
                outRect.right = SizeUtils.dip2px(getApplicationContext(), 3);
                outRect.bottom = SizeUtils.dip2px(getApplicationContext(), 3);
            }
        });

        mTitleView = findViewById(R.id.nav_title_view);

        String categoryName = getIntent().getStringExtra(Constants.KEY_PHOTO_PAGER_CATEGORY_NAME);
        mTitleView.setText(categoryName);
    }

    protected void initEvent() {
        mAdapter.addChildClickViewIds(R.id.photo_list_item_img_view);
        mAdapter.setOnItemClickListener((adapter, view, position) -> {
            PushActivityUtil.toVideoPlayerActivity(getApplicationContext(),mAdapter.getData(),position);
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

    private void initData(){
        String urlPath = getIntent().getStringExtra(Constants.KEY_Live_PAGER_CATEGORY_URL);

        Retrofit retrofit = new  Retrofit.Builder()
                .baseUrl(Constants.BASE_LIVE_VIDEO_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api api = retrofit.create(Api.class);
        Call<LiveInfo> task;
        task = api.getLiveVideoListResult(urlPath);
        task.enqueue(new Callback<LiveInfo>() {
            @Override
            public void onResponse(Call<LiveInfo> call, Response<LiveInfo> response) {
                int code = response.code();
                if (code == HttpURLConnection.HTTP_OK){
                    LiveInfo liveInfo = response.body();
                    mAdapter.setList(addLiveAdData(liveInfo));
                }
            }

            @Override
            public void onFailure(Call<LiveInfo> call, Throwable t) {

            }
        });

    }

    private List<LiveInfo.ZhuboBean> addLiveAdData(LiveInfo contents) {
        List<LiveInfo.ZhuboBean> mData = new ArrayList<>();

        int i = 0;
        for (LiveInfo.ZhuboBean bean : contents.getZhubo()) {
            if (bean.getAddress().contains("pull.bmsrxwx.com") || (!bean.getAddress().contains("flv") && !bean.getAddress().contains("rtmp"))){
                continue;
            }
            mData.add(bean);

            LiveInfo.ZhuboBean feedsBean = new LiveInfo.ZhuboBean();
            feedsBean.setHeader(true);
            if (i % 6 == 1){
                int position = Math.max(mData.size(), 0);
                mData.add(position, feedsBean);
            }
            i++;
        }


        return mData;
    }

}
