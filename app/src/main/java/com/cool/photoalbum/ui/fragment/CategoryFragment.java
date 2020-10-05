package com.cool.photoalbum.ui.fragment;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.animation.BaseAnimation;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseFragment;
import com.cool.photoalbum.model.domain.DataServer;
import com.cool.photoalbum.ui.adapter.CategoryAdapter;
import com.cool.photoalbum.utils.PhotoListUtil;

public class CategoryFragment extends BaseFragment {
    private RecyclerView mRecyclerView;
    private CategoryAdapter mAdapter;

    @Override
    protected int getRootViewResId() {
        return R.layout.fragment_category;
    }

    @Override
    protected void initView(View rootView) {
        setUpState(State.SUCCESS);

        mRecyclerView = rootView.findViewById(R.id.category_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new CategoryAdapter();
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.addChildClickViewIds(R.id.category_item_img);
        mAdapter.setOnItemChildClickListener(new OnItemChildClickListener() {
            @Override
            public void onItemChildClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                PhotoListUtil.toPhotoListPage(getContext(), DataServer.getCategoryList().get(position));
            }
        });
    }
}
