package com.cool.photoalbum.ui.adapter;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ThumbnailImageViewTarget;
import com.bumptech.glide.request.transition.Transition;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cool.photoalbum.R;
import com.cool.photoalbum.model.domain.IBasePhotoInfo;
import com.cool.photoalbum.model.domain.PhotoList;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import org.jetbrains.annotations.NotNull;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class BrowseAdapter extends BaseQuickAdapter<IBasePhotoInfo, BaseViewHolder> {
    public BrowseAdapter(){
        super(R.layout.item_browse_view);
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
}
