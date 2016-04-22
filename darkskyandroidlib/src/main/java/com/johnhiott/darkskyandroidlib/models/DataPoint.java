package com.johnhiott.darkskyandroidlib.models;

public class DataPoint {

    private long time;
    private String summary;
    private String icon;
    private long sunriseTime;
    private long sunsetTime;
    private float moonPhase;
    private int nearestStormDistance;
    private int nearestStormBearing;
    private float precipIntensity;
    private float precipIntensityMax;
    private long precipIntensityMaxTime;
    private float precipProbability;
    private String precipType;
    //    private String precipAccumulation;
    private float temperature;
    private float temperatureMin;
    private float temperatureMinTime;
    private float temperatureMax;
    private float temperatureMaxTime;
    private float apparentTemperature;
    private float apparentTemperatureMin;
    private float apparentTemperatureMinTime;
    private float apparentTemperatureMax;
    private float apparentTemperatureMaxTime;
    private float dewPoint;
    private float windSpeed;
    private float windBearing;
    private float cloudCover;
    private float humidity;
    private float pressure;
    private float visibility;
    private float ozone;

    public long getTime() {
        return time;
    }

    public String getSummary() {
        return summary;
    }

    public String getIcon() {
        return icon;
    }

    public long getSunriseTime() {
        return sunriseTime;
    }

    public long getSunsetTime() {
        return sunsetTime;
    }

    public float getMoonPhase() {
        return moonPhase;
    }

    public int getNearestStormDistance() {
        return nearestStormDistance;
    }

    public int getNearestStormBearing() {
        return nearestStormBearing;
    }

    public float getPrecipIntensity() {
        return precipIntensity;
    }

    public float getPrecipIntensityMax() {
        return precipIntensityMax;
    }

    public long getPrecipIntensityMaxTime() {
        return precipIntensityMaxTime;
    }

    public float getPrecipProbability() {
        return precipProbability;
    }

    public String getPrecipType() {
        return precipType;
    }

    /*public String getPrecipAccumulation() {
        return precipAccumulation;
    }*/

    public float getTemperature() {
        return temperature;
    }

    public float getTemperatureMin() {
        return temperatureMin;
    }

    public float getTemperatureMinTime() {
        return temperatureMinTime;
    }

    public float getTemperatureMax() {
        return temperatureMax;
    }

    public float getTemperatureMaxTime() {
        return temperatureMaxTime;
    }

    public float getApparentTemperature() {
        return apparentTemperature;
    }

    public float getApparentTemperatureMin() {
        return apparentTemperatureMin;
    }

    public float getApparentTemperatureMinTime() {
        return apparentTemperatureMinTime;
    }

    public float getApparentTemperatureMax() {
        return apparentTemperatureMax;
    }

    public float getApparentTemperatureMaxTime() {
        return apparentTemperatureMaxTime;
    }

    public float getDewPoint() {
        return dewPoint;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public float getWindBearing() {
        return windBearing;
    }

    public float getCloudClover() {
        return cloudCover;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getVisibility() {
        return visibility;
    }

    public float getOzone() {
        return ozone;
    }
}
