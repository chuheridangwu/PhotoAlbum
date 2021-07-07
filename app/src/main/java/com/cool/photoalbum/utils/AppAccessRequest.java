package com.cool.photoalbum.utils;

import android.util.Log;

import com.cool.photoalbum.model.Api;
import com.cool.photoalbum.model.domain.Access;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppAccessRequest {

    private OnAccessResultListener mListener;
    private static final AppAccessRequest ourInstance = new AppAccessRequest();
    public static AppAccessRequest getInstall(){
        return ourInstance;
    }

    public boolean isOpen(){
        return (mAccess != null && mAccess.isIsHWOpen()!= false) ? true : false;
    }

    public Access mAccess;

    public void getAppAccess(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/chuheridangwu/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api api = retrofit.create(Api.class);
        Call<Access> task = api.getAppAccess();
        task.enqueue(new Callback<Access>() {
            @Override
            public void onResponse(Call<Access> call, Response<Access> response) {
                int code = response.code();
                if (code == HttpURLConnection.HTTP_OK){
                    mAccess = response.body();
                    if (mListener != null) {
                        mListener.onResult();
                    }
                    Log.d("TAG", "onResponse:  获取启动权限成功");
                }
            }

            @Override
            public void onFailure(Call<Access> call, Throwable t) {
                t.printStackTrace();
                Log.d("TAG", "onResponse:  获取启动权限失败");
            }
        });

    }

    public final void setOnAccessResultListener(OnAccessResultListener listener){
        mListener = listener;
    }

    public interface OnAccessResultListener{
        void onResult();
    }
}
