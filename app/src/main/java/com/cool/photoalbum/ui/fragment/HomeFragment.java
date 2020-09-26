package com.cool.photoalbum.ui.fragment;

import android.view.View;
import android.view.WindowManager;

import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseFragment;

public class HomeFragment extends BaseFragment {
    @Override
    protected int getRootViewResId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView(View rootView) {
        setUpState(State.SUCCESS);
    }
}
