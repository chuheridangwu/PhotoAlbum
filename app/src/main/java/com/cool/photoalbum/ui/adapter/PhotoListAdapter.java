package com.cool.photoalbum.ui.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cool.photoalbum.R;
import com.cool.photoalbum.model.domain.PhotoList;

import org.jetbrains.annotations.NotNull;

public class PhotoListAdapter extends BaseQuickAdapter<PhotoList.FeedsBean, BaseViewHolder>{

    public PhotoListAdapter(){
        super(R.layout.item_photo_list_view);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, PhotoList.FeedsBean feedsBean) {
        ImageView imageView =  ((ImageView)baseViewHolder.getView(R.id.photo_list_item_img_view));
        Glide.with(getContext()).load(feedsBean.getImage_thumb()).into(imageView);
    }
}
