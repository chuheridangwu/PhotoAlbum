package com.cool.photoalbum.viewCallback;

import com.cool.photoalbum.model.domain.PhotoList;
import com.cool.photoalbum.model.domain.SearchResult;

public interface ISearchViewCallback {

    void onLoadMoreLoaded(SearchResult contents);

    void onContentLoaded(SearchResult contents);

    int getStartPosition();
}
