package com.johnhiott.darkskyandroid;

import android.app.Application;

import com.johnhiott.darkskyandroidlib.ForecastApi;

import okhttp3.logging.HttpLoggingInterceptor;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ForecastApi.create("YOUR-API-KEY", HttpLoggingInterceptor.Level.BODY);
    }
}
