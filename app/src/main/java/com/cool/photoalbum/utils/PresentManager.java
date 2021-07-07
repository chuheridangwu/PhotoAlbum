package com.cool.photoalbum.utils;

import com.cool.photoalbum.presenter.IPhotoListPresenter;
import com.cool.photoalbum.presenter.ISearchPresenter;
import com.cool.photoalbum.presenter.IVideoListPresenter;
import com.cool.photoalbum.presenter.impl.IPhotoListImpl;
import com.cool.photoalbum.presenter.impl.ISearchPhotoImpl;
import com.cool.photoalbum.presenter.impl.IVideoListImpl;

public class PresentManager {
    private static final PresentManager ourInstance = new PresentManager();
    private final IPhotoListImpl mIPhotoListPresenter;
    private final ISearchPresenter mSearchPresenter;
    private final IVideoListPresenter mVideoPresenter;

    public static PresentManager getInstance(){return  ourInstance;}
    private PresentManager(){

        mIPhotoListPresenter = new IPhotoListImpl();
        mSearchPresenter = new ISearchPhotoImpl();
        mVideoPresenter = new IVideoListImpl();
    }

    public IPhotoListPresenter getmIPhotoListPresenter() {
        return mIPhotoListPresenter;
    }

    public ISearchPresenter getmSearchPresenter() {
        return mSearchPresenter;
    }

    public IVideoListPresenter getmVideoPresenter(){return mVideoPresenter; }
}
