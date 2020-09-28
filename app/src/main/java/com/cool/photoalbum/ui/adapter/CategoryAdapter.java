package com.cool.photoalbum.ui.adapter;

import android.widget.ImageView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cool.photoalbum.R;
import com.cool.photoalbum.model.domain.Category;
import com.cool.photoalbum.model.domain.DataServer;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CategoryAdapter extends BaseQuickAdapter<Category, BaseViewHolder> {

    public CategoryAdapter() {
        super(R.layout.item_category, DataServer.getCategoryList());
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, Category category) {
        ((TextView)baseViewHolder.getView(R.id.category_item_title)).setText(category.getTitle());
        ((ImageView)baseViewHolder.getView(R.id.category_item_img)).setImageResource(category.getImg());

    }

}
