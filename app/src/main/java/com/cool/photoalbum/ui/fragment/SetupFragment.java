package com.cool.photoalbum.ui.fragment;

import android.view.View;
import android.widget.TextView;

import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseApplication;
import com.cool.photoalbum.base.BaseFragment;
import com.cool.photoalbum.utils.DialogUtil;
import com.cool.photoalbum.utils.GlideCacheUtil;
import com.cool.photoalbum.utils.PushActivityUtil;
import com.cool.photoalbum.utils.ToastUtils;

public class SetupFragment extends BaseFragment {
    private TextView mTitle;
    private View mDownRow;
    private View mClearCache;
    private View mAboutMe;

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
        mAboutMe = rootView.findViewById(R.id.set_up_about_me);
    }

    @Override
    protected void initListener() {
        // 跳转到下载界面
        mDownRow.setOnClickListener(v -> PushActivityUtil.toDownloadActivity(getContext()));

        // 清除缓存
        mClearCache.setOnClickListener(v -> {
            GlideCacheUtil.getOurInstance().clearImageAllCache(getContext());
            ToastUtils.showToast(getString(R.string.clear_cache_tip));
        });

        // 关于我们
        mAboutMe.setOnClickListener(v -> DialogUtil.showSureDialog(getContext(),getString(R.string.about_us),getString(R.string.about_me_content)));
    }

}
