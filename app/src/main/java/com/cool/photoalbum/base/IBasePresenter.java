package com.cool.photoalbum.base;

public interface IBasePresenter<T>  {

    void registerViewCallback(T callBack);

    void unregisterViewCallback(T callBack);
}
