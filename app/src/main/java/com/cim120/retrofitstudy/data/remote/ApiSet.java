package com.cim120.retrofitstudy.data.remote;

import com.cim120.retrofitstudy.model.Top250;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by chrisgong on 16/1/9.
 */
public interface ApiSet {

    /**
     * 服务器地址
     */
    public static final String HOST = "https://api.douban.com";

    @GET("/v2/movie/top250")
    Observable<Top250> getResult(@Query("start") int start, @Query("count") int count);
}
