package com.cool.photoalbum.ui.adapter;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cool.photoalbum.R;
import com.cool.photoalbum.model.domain.IBasePhotoInfo;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.ads.nativetemplates.NativeTemplateStyle;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import org.jetbrains.annotations.NotNull;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class BrowseAdapter extends BaseSectionQuickAdapter<IBasePhotoInfo, BaseViewHolder> {
    public BrowseAdapter(){
        super(R.layout.item_browse_ad_view,R.layout.item_browse_view,new ArrayList<>());
    }
    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, IBasePhotoInfo feedsBean) {
        PhotoView imageView = baseViewHolder.getView(R.id.browse_item_photo_view);
        ProgressBar progressBar = baseViewHolder.getView(R.id.browse_progress_bar);
        progressBar.setVisibility(View.VISIBLE);
        Glide.with(getContext()).load(feedsBean.bigUrl()).into(new CustomTarget<Drawable>() {
            @Override
            public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                imageView.setImageDrawable(resource);
                imageView.buildDrawingCache();
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onLoadCleared(@Nullable Drawable placeholder) {

            }
        });

        // 加载广告
        if (getItemPosition(feedsBean) % 5 == 0){
            AdView adView = baseViewHolder.getView(R.id.ad_view);
            adView.loadAd(new AdRequest.Builder().build());
        }
    }

    @Override
    protected void convertHeader(@NotNull BaseViewHolder baseViewHolder, @NotNull IBasePhotoInfo photoInfo) {
        AdLoader adLoader = new AdLoader.Builder(getContext(), getContext().getString(R.string.Ad_Mob_Native_ad))
                .forUnifiedNativeAd(unifiedNativeAd -> {
                    NativeTemplateStyle styles = new
                            NativeTemplateStyle.Builder()
                            .withMainBackgroundColor(new ColorDrawable(0xFFFFFF))
                            .build();
                    TemplateView template = baseViewHolder.getView(R.id.my_template);
                    template.setStyles(styles);
                    template.setNativeAd(unifiedNativeAd);
                })
                .build();

        adLoader.loadAd(new AdRequest.Builder().build());
    }
}
