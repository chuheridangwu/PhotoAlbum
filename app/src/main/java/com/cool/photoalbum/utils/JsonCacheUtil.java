package com.cool.photoalbum.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.cool.photoalbum.base.BaseApplication;
import com.cool.photoalbum.model.domain.IBasePhotoInfo;
import com.cool.photoalbum.model.domain.PhotoList;
import com.cool.photoalbum.model.domain.SearchResult;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
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
    public void savePhotoInfo(String key,List<IBasePhotoInfo> values){
        String json = mGson.toJson(values);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(key,json);
        editor.commit();
    }

    // 读取
    public List<IBasePhotoInfo> getPhotos(String key){
        String json = mSharedPreferences.getString(key,null);

        List<IBasePhotoInfo> photos = new ArrayList<>();

        Type type = new TypeToken<List<HashMap>>(){}.getType();
        List<HashMap> maps =mGson.fromJson(json, type);

        for (HashMap map : maps) {
            if (map.get("image_large") != null){
                PhotoList.FeedsBean feedsBean = new PhotoList.FeedsBean();
                feedsBean.setImage_large((String)map.get("image_large"));
                feedsBean.setImage_thumb((String)map.get("image_thumb"));
                photos.add(feedsBean);
            }else if (map.get("smallThumbUrl") != null){
                SearchResult.ItemsBean itemsBean = new SearchResult.ItemsBean();
                itemsBean.setSmallThumbUrl((String)map.get("smallThumbUrl"));
                itemsBean.setThumbUrl((String)map.get("thumbUrl"));
                itemsBean.setOri_pic_url((String)map.get("ori_pic_url"));
                itemsBean.setPic_url((String)map.get("pic_url"));
                photos.add(itemsBean);
            }
        }
        Log.d("TAG", "getPhotos: " + maps.toString());

        return photos;
    }

    // 使用Gson进行解析List对象
    public static <T> ArrayList<T> getObjects(String s, Class<T[]> clazz) {
        ArrayList<T> ts = new ArrayList<>();
        try {
            T[] arr = new Gson().fromJson(s, clazz);
            ts.addAll(Arrays.asList(arr));
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
        return ts;
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
