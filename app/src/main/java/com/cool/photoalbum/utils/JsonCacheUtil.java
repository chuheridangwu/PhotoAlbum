package com.cool.photoalbum.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.cool.photoalbum.base.BaseApplication;
import com.cool.photoalbum.model.domain.IBasePhotoInfo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class JsonCacheUtil {

    public static final String JSON_CACHE_SP_NAME = "JSON_CACHE_SP_NAME";
    private final SharedPreferences mSharedPreferences;
    private final Gson mGson;


    private JsonCacheUtil(){
        mSharedPreferences = BaseApplication.getAppContext().getSharedPreferences(JSON_CACHE_SP_NAME, Context.MODE_PRIVATE);
        mGson = new Gson();
    }

    // 保存
    public  void savePhotoInfo(String key,List<IBasePhotoInfo> values){
        String json = mGson.toJson(values);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(key,json);
        editor.commit();
    }

    // 读取
    public List<IBasePhotoInfo> getPhotos(String key){
        String json = mSharedPreferences.getString(key,null);
//        Type type = new TypeToken<List<IBasePhotoInfo>>(){}.getType();
//        List<IBasePhotoInfo> aryList = mGson.fromJson(json,type);
        List<HashMap> maps =mGson.fromJson(json, List.class);

        Log.d("TAG", "getPhotos: " + maps.toString());

        return new ArrayList<>();
    }


    // 删除
    public void delCache(String key,IBasePhotoInfo removeValue){
        mSharedPreferences.edit().remove(key).apply();
    }



    private static JsonCacheUtil sJsonCacheUtil = null;


    public static JsonCacheUtil getInstance(){
        if (sJsonCacheUtil == null) {
            sJsonCacheUtil = new JsonCacheUtil();
        }
        return sJsonCacheUtil;
    }
}
