package com.cool.photoalbum.ui.adapter;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

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

import java.util.ArrayList;

public class VideoPlayerAdapter extends BaseSectionQuickAdapter<IBasePhotoInfo, BaseViewHolder> {
    public VideoPlayerAdapter(){
        super(R.layout.item_browse_ad_view,R.layout.item_player_video_view,new ArrayList<>());
    }
    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, IBasePhotoInfo feedsBean) {
        ImageView imageView = baseViewHolder.getView(R.id.item_play_photo_view);
        Glide.with(getContext()).load(feedsBean.bigUrl()).into(imageView);

        // 加载广告
        if (getItemPosition(feedsBean) % 5 == 0){
            AdView adView = baseViewHolder.getView(R.id.ad_view);
            adView.loadAd(new AdRequest.Builder().build());
        }
        baseViewHolder.itemView.setTag(baseViewHolder.getAdapterPosition());
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

