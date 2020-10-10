package com.cool.photoalbum.presenter.impl;

import android.util.Log;

import com.cool.photoalbum.model.Api;
import com.cool.photoalbum.model.domain.PhotoList;
import com.cool.photoalbum.presenter.IPhotoListPresenter;
import com.cool.photoalbum.utils.RetrofitManager;
import com.cool.photoalbum.viewCallback.IPhotoListCallback;

import org.jetbrains.annotations.NotNull;

import java.net.HttpURLConnection;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class IPhotoListImpl implements IPhotoListPresenter {

    private Map<Integer,Integer> pagesInfo = new HashMap<>();
    private IPhotoListCallback mViewCallback;
    public static final int DEFAULT_COUNT = 20;
    private Integer mCurrentCount = DEFAULT_COUNT;

    @Override
    public void getCategoryContent(int categoryId) {

        // 因为使用的是单利，所以每次的时候进行初始化一次
        mCurrentCount = DEFAULT_COUNT;

        if (mViewCallback != null) {
            mViewCallback.onLoading();
        }

        Retrofit retrofit = RetrofitManager.getInstance().getRetrofit();
        Api api = retrofit.create(Api.class);
        Map<String, String> params = createParams(categoryId);
        Call<PhotoList> task = api.getCategoryContent(params);
        task.enqueue(new Callback<PhotoList>() {
            @Override
            public void onResponse(Call<PhotoList> call, Response<PhotoList> response) {
                int code = response.code();
                if (code == HttpURLConnection.HTTP_OK){
                    PhotoList list = response.body();
                    if (mViewCallback != null && list.getFeeds() != null) {
                        mViewCallback.onContentLoaded(list);
                    }
                }else {
                    if (mViewCallback != null) {
                        mViewCallback.onError();
                    }
                }

            }

            @Override
            public void onFailure(Call<PhotoList> call, Throwable t) {
                if (mViewCallback != null) {
                    mViewCallback.onError();
                }
            }
        });
    }

    // 生成参数
    @NotNull
    private Map<String, String> createParams(int categoryId) {
        Map<String,String> params = new HashMap<>();
        params.put("channel",String.valueOf(categoryId));
        params.put("count",String.valueOf(20));
        params.put("device",String.valueOf(2));
        params.put("start",String.valueOf(mCurrentCount-20));
        params.put("version",String.valueOf(1));
        return params;
    }

    @Override
    public void loaderMore(int categoryId) {
        mCurrentCount += DEFAULT_COUNT;
        Retrofit retrofit = RetrofitManager.getInstance().getRetrofit();
        Api api = retrofit.create(Api.class);
        Call<PhotoList> task = api.getCategoryContent(createParams(categoryId));
        task.enqueue(new Callback<PhotoList>() {
            @Override
            public void onResponse(Call<PhotoList> call, Response<PhotoList> response) {
                int code = response.code();
                if (code == HttpURLConnection.HTTP_OK){
                    PhotoList list = response.body();
                    if (mViewCallback != null) {
                        if (list.getFeeds() != null && list.getFeeds().size() > 0){
                            mViewCallback.onLoadMoreLoaded(list);
                        }else {
                            mViewCallback.onLoadMoreEmpty();
                        }
                    }
                }else {
                    onLoadMoreError();
                }
            }

            @Override
            public void onFailure(Call<PhotoList> call, Throwable t) {
                onLoadMoreError();
            }
        });

    }

    // 加载更多时出现错误
    private void onLoadMoreError() {
        mCurrentCount -= DEFAULT_COUNT;
        if (mViewCallback != null) {
            mViewCallback.onLoadMoreError();
        }
    }

    @Override
    public void reload(int categoryId) {
        getCategoryContent(categoryId);
    }

    @Override
    public void registerViewCallback(IPhotoListCallback callBack) {
        mViewCallback = callBack;
    }

    @Override
    public void unregisterViewCallback(IPhotoListCallback callBack) {
        mViewCallback = null;
    }
}
