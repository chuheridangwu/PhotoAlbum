package com.cool.photoalbum.ui.activity;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseActivity;
import com.cool.photoalbum.base.BaseApplication;
import com.cool.photoalbum.presenter.impl.ISavePhotoImpl;
import com.cool.photoalbum.ui.adapter.PhotoListAdapter;
import com.cool.photoalbum.utils.PushActivityUtil;
import com.cool.photoalbum.utils.SizeUtils;

public class DownloadActivity extends BaseActivity {

    private RecyclerView mRecyclerView;
    private ImageView mEmptyView;
    private PhotoListAdapter mAdapter;
    private ISavePhotoImpl mSavePresenter;

    @Override
    public int getLayoutResId() {
        return  R.layout.fragment_follow;
    }

    @Override
    protected void initView() {
        TextView mTitle = findViewById(R.id.nav_title_view);
        mTitle.setText(BaseApplication.getAppContext().getString(R.string.download));

        mEmptyView = findViewById(R.id.follow_empty_view);

        GridLayoutManager manager = new GridLayoutManager(this,3);
        manager.offsetChildrenVertical(5);
        manager.offsetChildrenHorizontal(5);

        mRecyclerView = findViewById(R.id.follow_recycler_view);
        mRecyclerView.setLayoutManager(manager);

        mAdapter = new PhotoListAdapter();
        mAdapter.setAnimationEnable(true);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.left = SizeUtils.dip2px(getApplicationContext(),3);
                outRect.right = SizeUtils.dip2px(getApplicationContext(),3);
                outRect.bottom = SizeUtils.dip2px(getApplicationContext(),3);
            }
        });
    }

    @Override
    protected void initPresenter() {
            mSavePresenter = new ISavePhotoImpl();
    }

    @Override
    protected void initEvent() {
        mAdapter.addChildClickViewIds(R.id.photo_list_item_img_view);
        mAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter<?, ?> adapter, @NonNull View view, int position) {
                PushActivityUtil.followToBrowseActivity(getApplicationContext(),mAdapter.getData(),position);
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
    }

    @Override
    protected void onStart() {
        super.onStart();
        refreshData();
    }

    @Override
    protected void onResume() {
        super.onResume();
        refreshData();
    }

    private void refreshData(){
        mAdapter.getData().clear();
        mAdapter.setList(mSavePresenter.getDownloadPhotoList());
        mEmptyView.setImageResource(R.mipmap.download_empty);
        mEmptyView.setVisibility(mAdapter.getData().size() == 0 ? View.VISIBLE : View.GONE);
    }
}
