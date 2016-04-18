package com.johnhiott.darkskyandroidlib;

import com.johnhiott.darkskyandroidlib.models.Request;
import com.johnhiott.darkskyandroidlib.models.WeatherResponse;

import retrofit2.Call;

public class RequestBuilder {

    private Weather mWeather;

    public RequestBuilder() {
        mWeather = ForecastApi.getInstance().getApi();
    }

    public Call<WeatherResponse> getWeather(Request request) {
        return mWeather.getWeather(request, request.getQueryParams());
    }

    /*public Observable<WeatherResponse> getWeather(Request request) {
        return mWeather.getWeather(request, request.getQueryParams());
    }*/
}