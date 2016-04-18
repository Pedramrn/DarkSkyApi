package com.johnhiott.darkskyandroidlib;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ForecastApi {

    private static ForecastApi instance = null;

    private static final String BASE_API_URL = "https://api.forecast.io/forecast/";
    private final Weather weatherApi;

    public static ForecastApi getInstance() {
        if (instance == null)
            throw new RuntimeException("ForecastApi.create has not called yet.");
        return instance;
    }

    public Weather getApi() {
        return weatherApi;
    }

    public static synchronized void create(String apiKey, HttpLoggingInterceptor.Level logLevel) {
        if (instance == null)
            instance = new ForecastApi(apiKey, logLevel);
    }

    private ForecastApi(String apiKey, HttpLoggingInterceptor.Level logLevel) {
        String apiUrl = BASE_API_URL + apiKey + "/";

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(logLevel);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        weatherApi = new Retrofit.Builder()
                .baseUrl(apiUrl)
//                .addConverterFactory(JacksonConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
                .create(Weather.class);

    }
}
