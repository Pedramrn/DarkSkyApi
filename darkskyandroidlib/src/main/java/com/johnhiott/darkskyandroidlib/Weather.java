package com.johnhiott.darkskyandroidlib;

import com.johnhiott.darkskyandroidlib.models.Request;
import com.johnhiott.darkskyandroidlib.models.WeatherResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface Weather {

    @GET("{request}")
    Call<WeatherResponse> getWeather(@Path("request") Request params, @QueryMap Map<String, String> query);

//    @GET("/{request}")
//    Observable<WeatherResponse> getWeather(@Path("request") Request params, @QueryMap Map<String, String> query);

}
