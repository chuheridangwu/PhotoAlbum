package com.cool.photoalbum.model;

import com.cool.photoalbum.model.domain.Access;
import com.cool.photoalbum.model.domain.PhotoList;
import com.cool.photoalbum.model.domain.SearchResult;

import java.util.Map;

import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface Api {

    // 分类接口
    @GET("public_time_line.php")
    Call<PhotoList> getCategoryContent(@QueryMap Map<String,String> params);

    // 启动接口
    @GET("JsonData/master/json.txt")
    Call<Access> getAppAccess();

    // 搜索结果
    @GET("pics")
    Call<SearchResult> getSearchResult(@QueryMap Map<String,String> params);
}
