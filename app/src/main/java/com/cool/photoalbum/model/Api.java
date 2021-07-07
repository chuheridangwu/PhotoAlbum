package com.cool.photoalbum.model;

import com.cool.photoalbum.model.domain.Access;
import com.cool.photoalbum.model.domain.LiveInfo;
import com.cool.photoalbum.model.domain.PhotoList;
import com.cool.photoalbum.model.domain.SearchResult;
import com.cool.photoalbum.model.domain.VideoList;

import java.util.List;
import java.util.Map;

import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
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

    // 视频列表
    @GET("acg/acg.php")
    Call<List<VideoList>> getVideoListResult(@QueryMap Map<String,String> params);

    // 直播列表
    @GET("{id}")
    Call<LiveInfo> getLiveVideoListResult(@Path("id") String path);
}
