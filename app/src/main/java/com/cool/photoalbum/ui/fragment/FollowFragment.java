package com.cool.photoalbum.ui.fragment;

import android.view.View;

import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseFragment;

public class FollowFragment extends BaseFragment {
    @Override
    protected int getRootViewResId() {
        return R.layout.fragment_follow;
    }

    @Override
    protected void initView(View rootView) {
        setUpState(State.SUCCESS);
    }
}
