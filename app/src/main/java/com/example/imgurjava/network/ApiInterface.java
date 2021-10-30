package com.example.imgurjava.network;

import com.example.imgurjava.dataClass.ImgurApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface ApiInterface {

    @GET("1")
    Call<ImgurApiResponse> getList(@Header("Authorization") String auth);
}
