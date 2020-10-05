package com.cool.photoalbum.model;

import com.cool.photoalbum.model.domain.PhotoList;

import java.util.Map;

import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface Api {
    @GET("public_time_line.php")
    Call<PhotoList> getCategoryContent(@QueryMap Map<String,String> params);

    @GET()
    Call<Response> getCategoryTest(@QueryMap Map<String,String> params);
}
