package com.example.carsapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    @GET("cars")
    Call<StackApiResponse> getCars(@Query("page") int page, @Query("pagesize") int pagesize);
}