package com.cool.photoalbum.ui.adapter;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cool.photoalbum.R;
import com.cool.photoalbum.model.domain.IBasePhotoInfo;
import com.cool.photoalbum.model.domain.PhotoList;
import com.github.chrisbanes.photoview.PhotoView;

import org.jetbrains.annotations.NotNull;

public class BrowseAdapter extends BaseQuickAdapter<IBasePhotoInfo, BaseViewHolder> {
    public BrowseAdapter(){
        super(R.layout.item_browse_view);
    }
    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, IBasePhotoInfo feedsBean) {
        PhotoView view = (PhotoView)baseViewHolder.getView(R.id.browse_item_photo_view);
        Glide.with(getContext()).load(feedsBean.bigUrl()).into(view);
    }
}
