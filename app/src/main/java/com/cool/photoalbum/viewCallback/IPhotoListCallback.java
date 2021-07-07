package com.cool.photoalbum.viewCallback;

import com.cool.photoalbum.base.IBaseCallback;
import com.cool.photoalbum.model.domain.PhotoList;

import java.util.List;

public interface IPhotoListCallback extends IBaseCallback {

    void onLoadMoreError();

    void onLoadMoreEmpty();

    void onLoadMoreLoaded(PhotoList contents);

    void onContentLoaded(PhotoList contents);

    int getStartPosition();
}
