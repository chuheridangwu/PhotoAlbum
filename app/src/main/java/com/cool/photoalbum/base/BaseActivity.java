package com.cool.photoalbum.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // 禁用横屏

        setContentView(getLayoutResId());

        initView();

        initEvent();

        initPresenter();
    }

    protected void initPresenter() {
    }

    protected  void initView(){

    }

    protected  void initEvent(){

    }

    public abstract int getLayoutResId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.release();
    }

    // 让子类释放资源
    protected void release(){

    };
}
