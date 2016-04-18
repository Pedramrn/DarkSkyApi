package com.johnhiott.darkskyandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.johnhiott.darkskyandroidlib.RequestBuilder;
import com.johnhiott.darkskyandroidlib.models.Request;
import com.johnhiott.darkskyandroidlib.models.WeatherResponse;

import javax.net.ssl.HttpsURLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestBuilder weather = new RequestBuilder();

        Request request = new Request();
        request.setLat("32.00");
        request.setLng("-81.00");
        request.setUnits(Request.Units.SI);
//        request.setLanguage(Request.Language.PIG_LATIN);
//        request.addExcludeBlock(Request.Block.CURRENTLY);
//        request.removeExcludeBlock(Request.Block.CURRENTLY);

        weather.getWeather(request).enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                if (response.code() == HttpsURLConnection.HTTP_OK) {
                    final WeatherResponse weatherResponse = response.body();
                    Toast.makeText(MainActivity.this,
                            "Temp: " + weatherResponse.getCurrently().getTemperature() + "\n"
                                    + "Summary: " + weatherResponse.getCurrently().getSummary() + "\n"
                                    + "Hourly Sum: " + weatherResponse.getHourly().getSummary()
                            , Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, response.message(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {
                Log.e(TAG, "Failed: ", t);
            }
        });
    }
}
