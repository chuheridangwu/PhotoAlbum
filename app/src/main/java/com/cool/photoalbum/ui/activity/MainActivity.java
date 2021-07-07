package com.cool.photoalbum.ui.activity;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

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

        setStatusBarTranslucent(this);

        // 检查相册权限
        checkPermission();
    }

    @Override
    protected void initEvent() {
        mNavigationView.setOnNavigationItemSelectedListener(item -> {
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
        });
    }

    private Fragment lastFragment;
    private void switchFragment(Fragment fragment) {

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

    /**
     * 设置状态栏透明
     */
    public void setStatusBarTranslucent(Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = activity.getWindow();
            window.setNavigationBarColor(Color.BLACK);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            View decorView = window.getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            //透明着色
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }

    // 获取相册权限
    private void checkPermission() {
        //检查权限（NEED_PERMISSION）是否被授权 PackageManager.PERMISSION_GRANTED表示同意授权
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            //用户已经拒绝过一次，再次弹出权限申请对话框需要给用户一个解释
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission
                    .WRITE_EXTERNAL_STORAGE)) {
                Toast.makeText(this, R.string.down_tip_authority, Toast.LENGTH_SHORT).show();
            }
            //申请权限
            int REQUEST_PERMISSION_CODE = 1;
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_PERMISSION_CODE);
        } else {
//            Toast.makeText(this, R.string.down_tip_authority_success, Toast.LENGTH_SHORT).show();
        }
    }
}