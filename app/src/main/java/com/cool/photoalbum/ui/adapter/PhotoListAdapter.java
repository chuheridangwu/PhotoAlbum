package com.cool.photoalbum.ui.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cool.photoalbum.R;
import com.cool.photoalbum.model.domain.IBasePhotoInfo;

import org.jetbrains.annotations.NotNull;

public class PhotoListAdapter extends BaseQuickAdapter<IBasePhotoInfo, BaseViewHolder>{

    public PhotoListAdapter(){
        super(R.layout.item_photo_list_view);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, IBasePhotoInfo feedsBean) {
        ImageView imageView =  ((ImageView)baseViewHolder.getView(R.id.photo_list_item_img_view));
        Glide.with(getContext()).load(feedsBean.smallUrl()).into(imageView);
    }
}
