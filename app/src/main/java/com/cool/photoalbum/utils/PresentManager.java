package com.cool.photoalbum.utils;

import com.cool.photoalbum.presenter.IPhotoListPresenter;
import com.cool.photoalbum.presenter.impl.IPhotoListImpl;

public class PresentManager {
    private static final PresentManager ourInstance = new PresentManager();
    private final IPhotoListImpl mIPhotoListPresenter;

    public static PresentManager getInstance(){return  ourInstance;}
    private PresentManager(){
        mIPhotoListPresenter = new IPhotoListImpl();
    }

    public IPhotoListPresenter getmIPhotoListPresenter() {
        return mIPhotoListPresenter;
    }
}
