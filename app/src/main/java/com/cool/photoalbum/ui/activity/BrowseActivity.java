package com.cool.photoalbum.ui.activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.cool.photoalbum.R;
import com.cool.photoalbum.model.domain.PhotoList;
import com.cool.photoalbum.ui.adapter.BrowseAdapter;
import com.cool.photoalbum.utils.Constants;
import com.cool.photoalbum.utils.DonwloadSaveImg;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

public class BrowseActivity extends AppCompatActivity {

    private static int REQUEST_PERMISSION_CODE = 1;

    private RecyclerView mRecyclerView;
    private BrowseAdapter mAdapter;
    private View mIconBack;
    private View mIconLike;
    private View mIconShare;
    private View mIconDownload;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_browse);

        initView();

        initEvent();
    }

    private void initEvent() {
        mIconBack = findViewById(R.id.browse_icon_back);
        mIconLike = findViewById(R.id.browse_icon_like_img);
        mIconShare = findViewById(R.id.browse_icon_share);
        mIconDownload = findViewById(R.id.browse_icon_download);

        mIconBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mIconLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIconLike.setBackgroundResource(R.mipmap.browse_like_selecte);
            }
        });

        mIconShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = ((LinearLayoutManager)mRecyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
                PhotoList.FeedsBean bean = mAdapter.getData().get(position);

                // 调用系统分享

                /** * 分享图片 */
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("image/png");
                try {
                    URL url = new URL(bean.getImage_large());
                    intent.putExtra(Intent.EXTRA_STREAM, url.toURI());
                } catch (MalformedURLException | URISyntaxException e) {
                    e.printStackTrace();
                }
                startActivity(Intent.createChooser(intent,"title"));
            }
        });

        mIconDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = ((LinearLayoutManager)mRecyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
                PhotoList.FeedsBean bean = mAdapter.getData().get(position);
                checkPermission();

                DonwloadSaveImg.donwloadImg(BrowseActivity.this,bean.getImage_large());//iPath

            }
        });

    }


    private void initView() {

        mRecyclerView= findViewById(R.id.browse_recycler_view);

        // 设置分页
        PagerSnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(mRecyclerView);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(manager);

        mAdapter = new BrowseAdapter();
        mRecyclerView.setAdapter(mAdapter);

        Intent intent = getIntent();
        ArrayList<PhotoList.FeedsBean> list1 = intent.getParcelableArrayListExtra(Constants.KEY_FEED_BEAN_LIST);
        int position = intent.getIntExtra(Constants.KEY_FEED_BEAN_LIST_POSITION,0);
        mAdapter.setList(list1);
        mRecyclerView.scrollToPosition(position);
    }


    // 获取相册权限
    private void checkPermission() {
        //检查权限（NEED_PERMISSION）是否被授权 PackageManager.PERMISSION_GRANTED表示同意授权
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            //用户已经拒绝过一次，再次弹出权限申请对话框需要给用户一个解释
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission
                    .WRITE_EXTERNAL_STORAGE)) {
                Toast.makeText(this, "请开通相关权限，否则无法正常使用本应用！", Toast.LENGTH_SHORT).show();
            }
            //申请权限
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_PERMISSION_CODE);
        } else {
            Toast.makeText(this, "授权成功！", Toast.LENGTH_SHORT).show();
        }
    }
}
