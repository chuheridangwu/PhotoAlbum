package com.cool.photoalbum.ui.fragment;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseFragment;
import com.cool.photoalbum.model.domain.DataServer;
import com.cool.photoalbum.ui.adapter.CategoryAdapter;
import com.cool.photoalbum.utils.PushActivityUtil;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class CategoryFragment extends BaseFragment {

    @Override
    protected int getRootViewResId() {
        return R.layout.fragment_category;
    }

    @Override
    protected void initView(View rootView) {
        setUpState(State.SUCCESS);

        RecyclerView mRecyclerView = rootView.findViewById(R.id.category_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        CategoryAdapter mAdapter = new CategoryAdapter();
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setAnimationEnable(true);
        mAdapter.addChildClickViewIds(R.id.category_item_img);
        mAdapter.setOnItemChildClickListener((adapter, view, position) -> PushActivityUtil.toPhotoListPage(getContext(), DataServer.getCategoryList().get(position)));

        AdView mAdView = rootView.findViewById(R.id.ad_view);
        mAdView.loadAd(new AdRequest.Builder().build());

    }

}
