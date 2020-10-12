package com.cool.photoalbum.ui.adapter;

import android.widget.ImageView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cool.photoalbum.R;
import com.cool.photoalbum.model.domain.Category;
import com.cool.photoalbum.model.domain.DataServer;

import org.jetbrains.annotations.NotNull;

public class HomeCategoryAdapter extends BaseQuickAdapter<Category, BaseViewHolder>  {

    public HomeCategoryAdapter() {
        super(R.layout.item_home_category_view, DataServer.getRecommendCategory());
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, Category category) {
        ((TextView)baseViewHolder.getView(R.id.item_home_category_title_view)).setText(category.getTitle());
        ((ImageView)baseViewHolder.getView(R.id.item_home_category_image_view)).setImageResource(category.getImg());
    }
}
