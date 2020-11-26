package com.cool.photoalbum.presenter.impl;

import com.cool.photoalbum.model.Api;
import com.cool.photoalbum.model.domain.PhotoList;
import com.cool.photoalbum.model.domain.VideoList;
import com.cool.photoalbum.presenter.IVideoListPresenter;
import com.cool.photoalbum.utils.Constants;
import com.cool.photoalbum.viewCallback.IPhotoListCallback;
import com.cool.photoalbum.viewCallback.IVideoListCallBack;

import org.jetbrains.annotations.NotNull;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IVideoListImpl implements IVideoListPresenter {

    private Map<Integer,Integer> pagesInfo = new HashMap<>();
    private IVideoListCallBack mViewCallback;
    public  int page = 0;
    @Override
    public void getCategoryContent(int categoryId) {

        if (mViewCallback != null) {
            mViewCallback.onLoading();
        }

        Call<List<VideoList>> task = createCallTask(categoryId);
        task.enqueue(new Callback<List<VideoList>>() {
            @Override
            public void onResponse(Call<List<VideoList>> call, Response<List<VideoList>> response) {
                int code = response.code();
                if (code == HttpURLConnection.HTTP_OK){
                    List<VideoList> list = response.body();
                    if (mViewCallback != null) {
                        mViewCallback.onContentLoaded(list);
                    }
                }else {
                    if (mViewCallback != null) {
                        mViewCallback.onError();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<VideoList>> call, Throwable t) {
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
        params.put("_ijt","i95d1joeir9tlbukomn424sef4");
        params.put("page",String.valueOf(page));
        params.put("action",createCategory(categoryId));
        return params;
    }

    // 根据分类返回参数
    private String createCategory(int categoryId){
        String string = "live_new";
        if (categoryId == 100){
            string = "live_hot";
        }else if (categoryId == 101){
            string = "live_rec";
        }
        return string;
    }

    // 生成请求头
    private Call<List<VideoList>> createCallTask(int categoryId){
        Retrofit retrofit = new  Retrofit.Builder()
                .baseUrl(Constants.BASE_VIDEO_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api api = retrofit.create(Api.class);
        Map<String, String> params = createParams(categoryId);
        Call<List<VideoList>> task = api.getVideoListResult(params);
        return task;
    }


    @Override
    public void loaderMore(int categoryId) {
        page += 1;
        Call<List<VideoList>> task = createCallTask(categoryId);
        task.enqueue(new Callback<List<VideoList>>() {
            @Override
            public void onResponse(Call<List<VideoList>> call, Response<List<VideoList>> response) {
                int code = response.code();
                if (code == HttpURLConnection.HTTP_OK){
                    List<VideoList> list = response.body();
                    if (mViewCallback != null) {
                        mViewCallback.onLoadMoreLoaded(list);
                    }
                }else {
                    if (mViewCallback != null) {
                        mViewCallback.onLoadMoreError();
                    }
                    page -= 1;
                }
            }

            @Override
            public void onFailure(Call<List<VideoList>> call, Throwable t) {
                if (mViewCallback != null) {
                    mViewCallback.onLoadMoreError();
                }
                page -= 1;
            }
        });
    }

    @Override
    public void reload(int categoryId) {

    }

    @Override
    public void registerViewCallback(IVideoListCallBack callBack) {
        mViewCallback = callBack;
    }

    @Override
    public void unregisterViewCallback(IVideoListCallBack callBack) {
        mViewCallback = null;
    }
}
