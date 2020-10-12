package com.cool.photoalbum.ui.fragment;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseFragment;
import com.cool.photoalbum.model.domain.IBasePhotoInfo;
import com.cool.photoalbum.presenter.impl.ISavePhotoImpl;
import com.cool.photoalbum.ui.adapter.PhotoListAdapter;
import com.cool.photoalbum.utils.Constants;
import com.cool.photoalbum.utils.JsonCacheUtil;
import com.cool.photoalbum.utils.PushActivityUtil;
import com.cool.photoalbum.utils.SizeUtils;

import java.util.List;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FollowFragment extends BaseFragment {

    private TextView mTitle;
    private RecyclerView mRecyclerView;
    private PhotoListAdapter mAdapter;
    private ISavePhotoImpl mSavePresenter;

    @Override
    protected int getRootViewResId() {
        return R.layout.fragment_follow;
    }

    @Override
    protected void initView(View rootView) {
        setUpState(State.SUCCESS);
        mTitle = rootView.findViewById(R.id.nav_title_view);
        mTitle.setText("关注");

        GridLayoutManager manager = new GridLayoutManager(getContext(),3);
        manager.offsetChildrenVertical(5);
        manager.offsetChildrenHorizontal(5);

        mRecyclerView = rootView.findViewById(R.id.follow_recycler_view);
        mRecyclerView.setLayoutManager(manager);

        mAdapter = new PhotoListAdapter();
        mAdapter.setAnimationEnable(true);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.left = SizeUtils.dip2px(getContext(),3);
                outRect.right = SizeUtils.dip2px(getContext(),3);
                outRect.bottom = SizeUtils.dip2px(getContext(),3);
            }
        });

    }

    @Override
    protected void initListener() {
        mAdapter.addChildClickViewIds(R.id.photo_list_item_img_view);
        mAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter<?, ?> adapter, @NonNull View view, int position) {
                PushActivityUtil.followToBrowseActivity(getContext(),mAdapter.getData(),position);
            }
        });
    }

    @Override
    protected void initPresenter() {
        mSavePresenter = new ISavePhotoImpl();
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden == false){
            refreshData();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        refreshData();

    }

    private void refreshData(){
        mAdapter.getData().clear();
        mAdapter.setList(mSavePresenter.getPhotoList());
    }
}
