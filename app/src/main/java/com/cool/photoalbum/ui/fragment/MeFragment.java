package com.cool.photoalbum.ui.fragment;

import android.view.View;
import android.widget.TextView;

import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseApplication;
import com.cool.photoalbum.base.BaseFragment;

public class MeFragment extends BaseFragment {
    private TextView mTitle;

    @Override
    protected int getRootViewResId() {
        return R.layout.fragment_me;
    }

    @Override
    protected void initView(View rootView) {
        setUpState(State.SUCCESS);
        mTitle = rootView.findViewById(R.id.nav_title_view);
        mTitle.setText(BaseApplication.getAppContext().getString(R.string.set_up));
    }
}
