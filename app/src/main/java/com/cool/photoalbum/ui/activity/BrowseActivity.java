package com.cool.photoalbum.ui.activity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.Message;
import android.provider.MediaStore;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.cool.photoalbum.R;
import com.cool.photoalbum.model.domain.PhotoList;
import com.cool.photoalbum.ui.adapter.BrowseAdapter;
import com.cool.photoalbum.utils.Constants;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class BrowseActivity extends AppCompatActivity {

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

            }
        });

        mIconDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int postion = ((LinearLayoutManager)mRecyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
                PhotoList.FeedsBean bean = mAdapter.getData().get(postion);

                // 调用系统分享

                /** * 分享图片 */
                Bitmap bgimg0 = getImageFromAssetsFile(bean.getImage_large());
                Intent share_intent = new Intent();
                share_intent.setAction(Intent.ACTION_SEND);//设置分享行为
                share_intent.setType("*/*");  //设置分享内容的类型
                share_intent.putExtra(Intent.EXTRA_STREAM, saveBitmap(bgimg0,"img"));
                //创建分享的Dialog
                share_intent = Intent.createChooser(share_intent, "dialogTitle");
                startActivity(share_intent);
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
        mAdapter.setList(list1);
    }

    /** * 从Assets中读取图片 */
    private Bitmap getImageFromAssetsFile(String fileName){
        Bitmap image = null;
        AssetManager am = getResources().getAssets();
        try {
            InputStream is=am.open(fileName);
            image=BitmapFactory.decodeStream(is);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();    }
        return image;
    }

    /** * 将图片存到本地 */
    private static Uri saveBitmap(Bitmap bm, String picName) {
        try {
            String dir= Environment.getExternalStorageDirectory().getAbsolutePath()+"/renji/"+picName+".jpg";
            File f = new File(dir);
            if (!f.exists()) {
                f.getParentFile().mkdirs();
                f.createNewFile();
            }
            FileOutputStream out = new FileOutputStream(f);
            bm.compress(Bitmap.CompressFormat.PNG, 90, out);
            out.flush();
            out.close();
            Uri uri = Uri.fromFile(f);
            return uri;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();    }
        return null;
    }
}
