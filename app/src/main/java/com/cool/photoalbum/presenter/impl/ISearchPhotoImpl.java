package com.cool.photoalbum.presenter.impl;

import android.util.Log;

import com.cool.photoalbum.model.Api;
import com.cool.photoalbum.model.domain.SearchResult;
import com.cool.photoalbum.presenter.ISearchPresenter;
import com.cool.photoalbum.utils.Constants;
import com.cool.photoalbum.viewCallback.ISearchViewCallback;

import org.jetbrains.annotations.NotNull;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ISearchPhotoImpl implements ISearchPresenter {

    public static final int DEFAULT_COUNT = 48;
    private Integer mCurrentCount = DEFAULT_COUNT;
    private ISearchViewCallback mViewCallback;

    public void getSearchResult(String content){

        mCurrentCount = 0;
        Map<String, String> params = createParams(content);

        Retrofit retrofit = new  Retrofit.Builder()
                .baseUrl(Constants.BASE_SEARCH_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api api = retrofit.create(Api.class);
        Call<SearchResult> task = api.getSearchResult(params);
        task.enqueue(new Callback<SearchResult>() {
            @Override
            public void onResponse(Call<SearchResult> call, Response<SearchResult> response) {

                int code = response.code();
                if (code == HttpURLConnection.HTTP_OK){
                    SearchResult result = response.body();
                    Log.d("TAG", "onResponse: " + result.toString());
                    if (mViewCallback != null) {
                        mViewCallback.onContentLoaded(result);
                    }
                }else {

                }
            }

            @Override
            public void onFailure(Call<SearchResult> call, Throwable t) {

            }
        });
    }

    @Override
    public void loadMoreResult(String content) {

    }

    @NotNull
    private Map<String, String> createParams(String content) {
        Map<String,String> params = new HashMap<>();
        params.put("query",content);
        params.put("start",mCurrentCount.toString());
        params.put("reqType","ajax");
        return params;
    }

    @Override
    public void registerViewCallback(ISearchViewCallback callBack) {
        mViewCallback = callBack;
    }

    @Override
    public void unregisterViewCallback(ISearchViewCallback callBack) {
        mViewCallback = null;
    }
}
