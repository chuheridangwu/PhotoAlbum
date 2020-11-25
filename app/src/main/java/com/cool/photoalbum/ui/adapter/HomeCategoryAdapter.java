package com.cool.photoalbum.ui.adapter;

import android.widget.ImageView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cool.photoalbum.R;
import com.cool.photoalbum.model.domain.Category;
import com.cool.photoalbum.model.domain.DataServer;

import org.jetbrains.annotations.NotNull;

public class HomeCategoryAdapter extends BaseSectionQuickAdapter<Category, BaseViewHolder> {

    public HomeCategoryAdapter() {
        super(R.layout.include_section_title_view, DataServer.getRecommendCategory());
        setNormalLayout(R.layout.item_home_category_view);
    }

    @Override
    protected void convertHeader(@NotNull BaseViewHolder baseViewHolder, @NotNull Category category) {
        ((TextView)baseViewHolder.findView(R.id.section_text_view)).setText(category.getTitle());
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, Category category) {
        ((TextView)baseViewHolder.getView(R.id.item_home_category_title_view)).setText(category.getTitle());
        ((ImageView)baseViewHolder.getView(R.id.item_home_category_image_view)).setImageResource(category.getImg());
    }
}
