package com.example.demodynamicarraylist.retrofit;

import com.example.demodynamicarraylist.response.AttributeResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
	@GET("getAttributes")
	Call<AttributeResponse> getAttributes(@Query("productId") int productId);
}
