package com.cool.photoalbum.ui.fragment;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseFragment;
import com.cool.photoalbum.model.domain.DataServer;
import com.cool.photoalbum.ui.adapter.HomeCategoryAdapter;
import com.cool.photoalbum.ui.custom.TextFlowLayout;
import com.cool.photoalbum.ui.decoration.GridSectionAverageGapItemDecoration;
import com.cool.photoalbum.utils.AppAccessRequest;
import com.cool.photoalbum.utils.GridSpacingItemDecoration;
import com.cool.photoalbum.utils.PushActivityUtil;

public class HomeFragment extends BaseFragment {

    private EditText mSearchEditText;
    private View mClearEditTextBtn;
    private TextFlowLayout mFlowLayout;
    private HomeCategoryAdapter mAdapter;

    @Override
    protected int getRootViewResId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView(View rootView) {
        setUpState(State.SUCCESS);

        RecyclerView mRecyclerView = rootView.findViewById(R.id.home_recycler_view);

        GridLayoutManager manager = new GridLayoutManager(getContext(),3);
        mRecyclerView.setLayoutManager(manager);

        mAdapter = new HomeCategoryAdapter();
        mRecyclerView.setAdapter(mAdapter);

//        int spanCount = 3; // 3 columns
//        int spacing = 15; // 50px
//        boolean includeEdge = true;
//        mRecyclerView.addItemDecoration(new GridSpacingItemDecoration(spanCount, spacing, includeEdge));

//      添加头部
        View headView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_home_top,mRecyclerView,false);
        mAdapter.addHeaderView(headView);

        mFlowLayout = headView.findViewById(R.id.home_flow_text_view);
        mFlowLayout.setTextList(DataServer.getRecommendTags());

        mSearchEditText = headView.findViewById(R.id.home_search_edit);
        mClearEditTextBtn = headView.findViewById(R.id.home_search_remove);

//        View view = headView.findViewById(R.id.home_top_category_name);
//        TextView textView = view.findViewById(R.id.section_text_view);
//        textView.setText(R.string.recommended);
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

        // 点击键盘确定按钮
        mSearchEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_SEARCH ){
                    String keyword = textView.getText().toString().trim();
                    if (TextUtils.isEmpty(keyword)) {
                        return false;
                    }
                    PushActivityUtil.homeToPhotoListPage(getContext(),keyword);
                    mSearchEditText.setText("");
                }
                return false;
            }
        });

        //点击删除搜索框的文字
        mClearEditTextBtn.setOnClickListener(v -> {
            mSearchEditText.setText("");
            // 关闭键盘
//              InputMethodManager inputMethodManager = (InputMethodManager)getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
//              inputMethodManager.hideSoftInputFromWindow(mSearchEditText.getWindowToken(),0);
        });

        // 点击推荐文字
        mFlowLayout.setOnFlowTextItemClickListener(text -> PushActivityUtil.homeToPhotoListPage(getContext(),text));

        // 监听item的点击
        mAdapter.addChildClickViewIds(R.id.item_home_category_image_view);
        mAdapter.setOnItemChildClickListener((adapter, view, position) -> PushActivityUtil.toPhotoListPage(getContext(), DataServer.getRecommendCategory().get(position)));

        AppAccessRequest.getInstall().setOnAccessResultListener(() -> mAdapter.setList(DataServer.getRecommendCategory()));
    }
}
