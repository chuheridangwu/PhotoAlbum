package com.cool.photoalbum.viewCallback;

import com.cool.photoalbum.base.IBaseCallback;
import com.cool.photoalbum.model.domain.VideoList;

import java.util.List;

public interface IVideoListCallBack extends IBaseCallback {
    void onLoadMoreError();

    void onLoadMoreEmpty();

    void onLoadMoreLoaded(List<VideoList> contents);

    void onContentLoaded(List<VideoList> contents);

    int getStartPosition();
}
