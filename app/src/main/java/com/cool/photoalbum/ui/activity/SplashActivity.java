package com.cool.photoalbum.ui.activity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cool.photoalbum.R;
import com.google.android.ads.nativetemplates.NativeTemplateStyle;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;

public class SplashActivity extends AppCompatActivity {

    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initAdView();

        initEvent();

        handler = new Handler();
        runnable = () -> {
            startActivity(new Intent(SplashActivity.this,MainActivity.class));
            finish();
        };
        handler.postDelayed(runnable,5000);
    }

    private void initEvent() {
        findViewById(R.id.splash_jump_btn).setOnClickListener( v-> {
            handler.removeCallbacks(runnable);
            startActivity(new Intent(this,MainActivity.class));
            finish();
        });
    }

    private void initAdView(){
        AdLoader adLoader = new AdLoader.Builder(this,getString(R.string.Ad_Mob_Native_ad))
                .forUnifiedNativeAd(unifiedNativeAd -> {
                    NativeTemplateStyle styles = new
                            NativeTemplateStyle.Builder()
                            .withMainBackgroundColor(new ColorDrawable(0xFFFFFF))
                            .build();
                    TemplateView template = findViewById(R.id.my_template);
                    template.setStyles(styles);
                    template.setNativeAd(unifiedNativeAd);
                })
                .build();

        adLoader.loadAd(new AdRequest.Builder().build());
    }
}
