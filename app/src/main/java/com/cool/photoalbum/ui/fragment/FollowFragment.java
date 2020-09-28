package com.cool.photoalbum.ui.fragment;

import android.view.View;
import android.widget.TextView;

import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseFragment;

public class FollowFragment extends BaseFragment {

    private TextView mTitle;

    @Override
    protected int getRootViewResId() {
        return R.layout.fragment_follow;
    }

    @Override
    protected void initView(View rootView) {
        setUpState(State.SUCCESS);
        mTitle = rootView.findViewById(R.id.nav_title_view);
        mTitle.setText("关注");
    }
}
