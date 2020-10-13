package com.cool.photoalbum.ui.fragment;

import android.view.View;
import android.widget.TextView;

import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseApplication;
import com.cool.photoalbum.base.BaseFragment;
import com.cool.photoalbum.utils.GlideCacheUtil;
import com.cool.photoalbum.utils.PushActivityUtil;

public class SetupFragment extends BaseFragment {
    private TextView mTitle;
    private View mDownRow;
    private View mClearCache;

    @Override
    protected int getRootViewResId() {
        return R.layout.fragment_set_up;
    }

    @Override
    protected void initView(View rootView) {
        setUpState(State.SUCCESS);
        mTitle = rootView.findViewById(R.id.nav_title_view);
        mTitle.setText(BaseApplication.getAppContext().getString(R.string.set_up));

        mDownRow = rootView.findViewById(R.id.set_up_look_download);
        mClearCache = rootView.findViewById(R.id.set_up_clear_cache);
    }

    @Override
    protected void initListener() {
        // 跳转到下载界面
        mDownRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PushActivityUtil.toDownloadActivity(getContext());
            }
        });

        // 清除缓存
        mClearCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlideCacheUtil.getOurInstance().clearImageAllCache(getContext());
            }
        });
    }
}
