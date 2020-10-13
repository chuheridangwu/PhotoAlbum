package com.cool.photoalbum.ui.activity;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.view.MenuItem;
import android.view.WindowManager;


import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseActivity;
import com.cool.photoalbum.ui.fragment.CategoryFragment;
import com.cool.photoalbum.ui.fragment.FollowFragment;
import com.cool.photoalbum.ui.fragment.HomeFragment;
import com.cool.photoalbum.ui.fragment.SetupFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends BaseActivity {

    private HomeFragment mHomeFragment;
    private CategoryFragment mCategoryFragment;
    private FollowFragment mFollowFragment;
    private SetupFragment mSetupFragment;
    private BottomNavigationView mNavigationView;
    private FragmentManager mFm;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        mNavigationView = findViewById(R.id.main_navigation);
        mHomeFragment = new HomeFragment();
        mCategoryFragment = new CategoryFragment();
        mFollowFragment = new FollowFragment();
        mSetupFragment = new SetupFragment();

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
                        switchFragment(mSetupFragment);
                        break;
                }
                return true;
            }
        });
    }

    private Fragment lastFragment;
    private void switchFragment(Fragment fragment) {

        switchFullScreen(fragment);

        FragmentTransaction transaction = mFm.beginTransaction();
        if (lastFragment != null){
            transaction.hide(lastFragment);
        }
        if (fragment.isAdded()){
            transaction.show(fragment);
        }else {
            transaction.add(R.id.base_container,fragment);
        }
        lastFragment = fragment;

        transaction.commit();
    }

    private void switchFullScreen(Fragment fragment){
        //  设置是否是全屏
        if ((fragment instanceof HomeFragment)){
            this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }else {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
    }
}