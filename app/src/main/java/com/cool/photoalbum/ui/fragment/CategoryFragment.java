package com.cool.photoalbum.ui.fragment;

import android.view.View;

import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseFragment;

public class CategoryFragment extends BaseFragment {
    @Override
    protected int getRootViewResId() {
        return R.layout.fragment_category;
    }

    @Override
    protected void initView(View rootView) {
        setUpState(State.SUCCESS);
    }
}
