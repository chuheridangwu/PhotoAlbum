package com.cool.photoalbum.base;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.cool.photoalbum.R;

public abstract class BaseFragment extends Fragment {

    private FrameLayout mBaseContainer;
    private  State currentState = State.NONE;
    private View mSuccessView;
    private View mErrorView;
    private View mLoadingView;
    private View mEmptyView;

    public enum State{
        NONE,LOADING,SUCCESS,ERROR,EMPTY
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = loadRootView(inflater,container);

        mBaseContainer = rootView.findViewById(R.id.base_container);

        loadStatesView(inflater,container);

        initView(rootView);
        initListener();
        initPresenter();
        loadData();
        return rootView;
    }

    protected  View loadRootView(LayoutInflater inflater, ViewGroup container){
        return inflater.inflate(R.layout.base_fragment_layout,container,false);
    }

    protected void loadStatesView(LayoutInflater inflater, ViewGroup container){
        mSuccessView =  loadSuccessView(inflater,container);
        mBaseContainer.addView(mSuccessView);

        mLoadingView = loadLoadingView(inflater,container);
        mBaseContainer.addView(mLoadingView);

        mErrorView = loadErrorView(inflater,container);
        mBaseContainer.addView(mErrorView);

        mEmptyView = loadEmptyView(inflater,container);
        mBaseContainer.addView(mEmptyView);

        setUpState(State.NONE);
    }

    public void setUpState(State state) {
        this.currentState = state;
        mSuccessView.setVisibility(state == State.SUCCESS ? View.VISIBLE : View.GONE);
        mErrorView.setVisibility(state == State.ERROR ? View.VISIBLE : View.GONE);
        mLoadingView.setVisibility(state == State.LOADING ? View.VISIBLE : View.GONE);
        mEmptyView.setVisibility(state == State.EMPTY ? View.VISIBLE : View.GONE);
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        release();
    }

    // 释放资源
    protected void release() {
    }

    // 初始化view
    protected void initView(View rootView){

    }

    // 设置监听
    protected  void initListener(){

    }

    // 创建Presenter
    protected void initPresenter() {

    }

    // 加载数据
    protected void loadData(){

    }

    protected View loadSuccessView(LayoutInflater inflater, ViewGroup container){
        // 获取资源类
        int resId = getRootViewResId();
        return inflater.inflate(resId,container,false);
    }


    private View loadEmptyView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_empty,container,false);
    }

    private View loadLoadingView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_loading,container,false);
    }

    private View loadErrorView(LayoutInflater inflater, ViewGroup container) {
        View view = inflater.inflate(R.layout.fragment_error,container,false);
        view.findViewById(R.id.network_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "onClick:  网络错误");
                onRetryNetWork();
            }
        });
        return  view;
    }

    // 重新加载
    public void onRetryNetWork(){

    }

    protected abstract int getRootViewResId();
}
