package com.cool.photoalbum.ui.activity;

import android.content.Intent;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseActivity;
import com.cool.photoalbum.model.domain.PhotoList;
import com.cool.photoalbum.ui.adapter.BrowseAdapter;
import com.cool.photoalbum.utils.Constants;
import com.github.chrisbanes.photoview.PhotoView;

import java.util.ArrayList;
import java.util.List;

public class BrowseActivity extends BaseActivity {

    List<PhotoList.FeedsBean> list = new ArrayList<>();

    private RecyclerView mRecyclerView;
    private BrowseAdapter mAdapter;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_browse;
    }

    @Override
    protected void initView() {
        mRecyclerView= findViewById(R.id.browse_recycler_view);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(manager);

        mAdapter = new BrowseAdapter();
        mRecyclerView.setAdapter(mAdapter);

        Intent intent = getIntent();
        list = intent.getParcelableArrayListExtra(Constants.KEY_FEED_BEAN_LIST);
        mAdapter.addData(list);
    }
}
