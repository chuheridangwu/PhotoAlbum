package com.cool.photoalbum.presenter;

import com.cool.photoalbum.base.IBasePresenter;
import com.cool.photoalbum.viewCallback.ISearchViewCallback;

public interface ISearchPresenter extends IBasePresenter<ISearchViewCallback> {

     void getSearchResult(String content);

     void loadMoreResult(String content);
}

