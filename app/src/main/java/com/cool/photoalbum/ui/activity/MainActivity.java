package com.cool.photoalbum.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseActivity;
import com.cool.photoalbum.ui.fragment.CategoryFragment;
import com.cool.photoalbum.ui.fragment.FollowFragment;
import com.cool.photoalbum.ui.fragment.HomeFragment;
import com.cool.photoalbum.ui.fragment.MeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends BaseActivity {

    private HomeFragment mHomeFragment;
    private CategoryFragment mCategoryFragment;
    private FollowFragment mFollowFragment;
    private MeFragment mMeFragment;
    private BottomNavigationView mNavigationView;
    private FragmentManager mFm;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        //透明状态栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //透明导航栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        mNavigationView = findViewById(R.id.main_navigation);
        mHomeFragment = new HomeFragment();
        mCategoryFragment = new CategoryFragment();
        mFollowFragment = new FollowFragment();
        mMeFragment = new MeFragment();

        mFm = getSupportFragmentManager();

        switchFragment(mHomeFragment);

    }

    @Override
    protected void initEvent() {
        mNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_item_home:
                        switchFragment(mHomeFragment);
                        break;
                    case R.id.nav_item_category:
                        switchFragment(mCategoryFragment);
                        break;
                    case R.id.nav_item_follow:
                        switchFragment(mFollowFragment);
                        break;
                    case R.id.nav_item_me:
                        switchFragment(mMeFragment);
                        break;
                }
                return true;
            }
        });
    }

    private Fragment lastFragment;
    private void switchFragment(Fragment fragment) {
        FragmentTransaction transaction = mFm.beginTransaction();
        if (fragment.isAdded()){
            transaction.show(fragment);
        }else {
            transaction.add(R.id.base_container,fragment);
        }
        if (lastFragment != null){
            transaction.hide(lastFragment);
        }
        lastFragment = fragment;

        transaction.commit();
    }
}