package com.cool.photoalbum.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import com.cool.photoalbum.model.domain.Category;
import com.cool.photoalbum.model.domain.PhotoList;
import com.cool.photoalbum.presenter.IPhotoListPresenter;
import com.cool.photoalbum.ui.activity.BrowseActivity;
import com.cool.photoalbum.ui.activity.PhotoListActivity;
import com.cool.photoalbum.ui.adapter.BrowseAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PushActivityUtil {
    public static void toPhotoListPage(Context context, Category category){
        int categoryId = category.getChannel();
        IPhotoListPresenter photoListPresent = PresentManager.getInstance().getmIPhotoListPresenter();
        photoListPresent.getCategoryContent(categoryId);
        Intent intent = new Intent(context,PhotoListActivity.class);
        intent.putExtra(Constants.KEY_PHOTO_PAGER_CATEGORY_ID,categoryId);
        context.startActivity(intent);
    }

    public static void toBrowseActivity(Context context, List<PhotoList.FeedsBean> photos, int index){
        Intent intent = new Intent(context, BrowseActivity.class);
        intent.putParcelableArrayListExtra(Constants.KEY_FEED_BEAN_LIST,new ArrayList<PhotoList.FeedsBean>(photos));
        intent.putExtra(Constants.KEY_FEED_BEAN_LIST_INDEX,index);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
