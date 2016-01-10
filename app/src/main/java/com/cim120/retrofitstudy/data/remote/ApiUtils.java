package com.cim120.retrofitstudy.data.remote;

import com.squareup.okhttp.OkHttpClient;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by chrisgong on 16/1/9.
 */
public class ApiUtils {

    private static ApiSet apiSet = null;

    public static ApiSet getInstance() {
        if (apiSet == null) {
            apiSet = new Retrofit.Builder()
                    .baseUrl(ApiSet.HOST)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(new OkHttpClient())
                    .build().create(ApiSet.class);
        }
        return apiSet;
    }
}
