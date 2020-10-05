package com.cool.photoalbum.utils;

import android.content.Context;
import android.content.Intent;

import com.cool.photoalbum.model.domain.Category;
import com.cool.photoalbum.presenter.IPhotoListPresenter;
import com.cool.photoalbum.presenter.impl.IPhotoListImpl;
import com.cool.photoalbum.ui.activity.PhotoListActivity;

public class PhotoListUtil {
    public static void toPhotoListPage(Context context, Category category){
        int categoryId = category.getChannel();
        IPhotoListPresenter photoListPresent = PresentManager.getInstance().getmIPhotoListPresenter();
        photoListPresent.getCategoryContent(categoryId);
        context.startActivity(new Intent(context, PhotoListActivity.class));

    }
}
