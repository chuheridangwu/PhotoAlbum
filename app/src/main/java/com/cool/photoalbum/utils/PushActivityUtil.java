package com.cool.photoalbum.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;

import com.cool.photoalbum.model.domain.Category;
import com.cool.photoalbum.model.domain.IBasePhotoInfo;
import com.cool.photoalbum.model.domain.PhotoList;
import com.cool.photoalbum.presenter.IPhotoListPresenter;
import com.cool.photoalbum.presenter.ISearchPresenter;
import com.cool.photoalbum.ui.activity.BrowseActivity;
import com.cool.photoalbum.ui.activity.PhotoListActivity;

import java.util.ArrayList;
import java.util.List;

public class PushActivityUtil {

   public enum PhotoActivityType{
        PHOTO_ACTIVITY_TYPE_CATEGORY, //分类
        PHOTO_ACTIVITY_TYPE_SEARCH, // 搜索
    }

    public static PhotoActivityType photoActivityType = PhotoActivityType.PHOTO_ACTIVITY_TYPE_CATEGORY;

    public static void toPhotoListPage(Context context, Category category){
        int categoryId = category.getChannel();
        IPhotoListPresenter photoListPresent = PresentManager.getInstance().getmIPhotoListPresenter();
        photoListPresent.getCategoryContent(categoryId);
        Intent intent = new Intent(context,PhotoListActivity.class);
        intent.putExtra(Constants.KEY_PHOTO_PAGER_CATEGORY_ID,categoryId);
        photoActivityType = PhotoActivityType.PHOTO_ACTIVITY_TYPE_CATEGORY;
        context.startActivity(intent);
    }

    public static void toBrowseActivity(Context context, List<IBasePhotoInfo> photos, int index, int categoryId,String keyboard){
        Intent intent = new Intent(context, BrowseActivity.class);
        intent.putParcelableArrayListExtra(Constants.KEY_FEED_BEAN_LIST, (ArrayList<? extends Parcelable>) new ArrayList<IBasePhotoInfo>(photos));
        intent.putExtra(Constants.KEY_FEED_BEAN_LIST_POSITION,index);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra(Constants.KEY_FEED_BEAN_LIST_CATEGORY_ID,categoryId);
        intent.putExtra(Constants.KEY_FEED_BEAN_LIST_KEYBOARD,keyboard);
        context.startActivity(intent);
    }

    public static void homeToPhotoListPage(Context context,String keyboard){
        ISearchPresenter photoListPresent = PresentManager.getInstance().getmSearchPresenter();
        photoListPresent.getSearchResult(keyboard);
        Intent intent = new Intent(context,PhotoListActivity.class);
        intent.putExtra(Constants.KEY_PHOTO_PAGER_KEYBOARD,keyboard);
        photoActivityType = PhotoActivityType.PHOTO_ACTIVITY_TYPE_SEARCH;
        context.startActivity(intent);
    }
}
