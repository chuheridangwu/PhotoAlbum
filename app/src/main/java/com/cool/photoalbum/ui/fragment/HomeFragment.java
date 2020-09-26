package com.cool.photoalbum.ui.fragment;

import android.view.View;
import android.view.WindowManager;

import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseFragment;
import com.cool.photoalbum.ui.custom.TextFlowLayout;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends BaseFragment {
    @Override
    protected int getRootViewResId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView(View rootView) {
        setUpState(State.SUCCESS);
        List<String> textList = new ArrayList<>();
        textList.add("早上好");
        textList.add("早安");
        textList.add("唯美");
        textList.add("情侣头像");
        textList.add("情侣头像");
        TextFlowLayout text = rootView.findViewById(R.id.home_flow_text_view);
        text.setTextList(textList);
    }
}
