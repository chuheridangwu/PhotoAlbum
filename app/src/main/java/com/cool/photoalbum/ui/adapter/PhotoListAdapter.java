package com.cool.photoalbum.ui.adapter;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cool.photoalbum.R;
import com.cool.photoalbum.model.domain.IBasePhotoInfo;
import com.google.android.ads.nativetemplates.NativeTemplateStyle;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.formats.UnifiedNativeAd;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class PhotoListAdapter extends BaseSectionQuickAdapter<IBasePhotoInfo, BaseViewHolder> {

    public PhotoListAdapter(){
        super(R.layout.item_ad_header_view,R.layout.item_photo_list_view,new ArrayList<>());
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, IBasePhotoInfo feedsBean) {
        ImageView imageView =  ((ImageView)baseViewHolder.getView(R.id.photo_list_item_img_view));
        Glide.with(getContext()).load(feedsBean.smallUrl()).into(imageView);
    }

    @Override
    protected void convertHeader(@NotNull BaseViewHolder baseViewHolder, @NotNull IBasePhotoInfo photoInfo) {
        AdLoader adLoader = new AdLoader.Builder(getContext(), "ca-app-pub-3940256099942544/2247696110")
                .forUnifiedNativeAd(new UnifiedNativeAd.OnUnifiedNativeAdLoadedListener() {
                    @Override
                    public void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
                        NativeTemplateStyle styles = new
                                NativeTemplateStyle.Builder().withMainBackgroundColor(new ColorDrawable(0x03DAC5)).build();
                        TemplateView template = baseViewHolder.getView(R.id.my_template);
                        template.setStyles(styles);
                        template.setNativeAd(unifiedNativeAd);
                    }
                })
                .build();

        adLoader.loadAd(new AdRequest.Builder().build());
    }

}
