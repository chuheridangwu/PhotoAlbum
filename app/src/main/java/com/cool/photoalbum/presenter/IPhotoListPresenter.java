package com.cool.photoalbum.presenter;

import com.cool.photoalbum.base.IBasePresenter;
import com.cool.photoalbum.viewCallback.IPhotoListCallback;

public interface IPhotoListPresenter extends IBasePresenter<IPhotoListCallback> {

    // 获取分类
    void getCategoryContent(int categoryId);

    // 获取更多
    void loaderMore(int categoryId);

    void reload(int categoryId);

}
