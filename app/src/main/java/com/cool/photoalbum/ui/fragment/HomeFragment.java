package com.cool.photoalbum.ui.fragment;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseFragment;
import com.cool.photoalbum.model.domain.DataServer;
import com.cool.photoalbum.ui.custom.TextFlowLayout;
import com.cool.photoalbum.utils.PushActivityUtil;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends BaseFragment {

    private EditText mSearchEditText;
    private View mClearEditTextBtn;
    private TextFlowLayout mFlowLayout;

    @Override
    protected int getRootViewResId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView(View rootView) {
        setUpState(State.SUCCESS);

        mFlowLayout = rootView.findViewById(R.id.home_flow_text_view);
        mFlowLayout.setTextList(DataServer.getRecommendTags());

        mSearchEditText = rootView.findViewById(R.id.home_search_edit);
        mClearEditTextBtn = rootView.findViewById(R.id.home_search_remove);
    }

    @Override
    protected void initListener() {
        // 监听键盘输入
        mSearchEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String text = charSequence.toString();
                mClearEditTextBtn.setVisibility(text.length() > 0 ? View.VISIBLE : View.GONE);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        // 点击确定按钮
        mSearchEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_SEARCH ){
                    String keyword = textView.getText().toString().trim();
                    if (TextUtils.isEmpty(keyword)) {
                        return false;
                    }
                    PushActivityUtil.homeToPhotoListPage(getContext(),keyword);
                }
                return false;
            }
        });

        // 点击推荐按钮
        mFlowLayout.setOnFlowTextItemClickListener(new TextFlowLayout.OnFlowTextItemClickListener() {
            @Override
            public void onFlowItemClick(String text) {
                PushActivityUtil.homeToPhotoListPage(getContext(),text);
            }
        });
    }
}
