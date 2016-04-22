package com.johnhiott.darkskyandroidlib.models;

public class DataPoint {

    private Long time;
    private String summary;
    private String icon;
    private Long sunriseTime;
    private Long sunsetTime;
    private Float moonPhase;
    private Integer nearestStormDistance;
    private Integer nearestStormBearing;
    private Float precipIntensity;
    private Float precipIntensityMax;
    private Long precipIntensityMaxTime;
    private Float precipProbability;
    private String precipType;
    //    private String precipAccumulation;
    private Float temperature;
    private Float temperatureMin;
    private Float temperatureMinTime;
    private Float temperatureMax;
    private Float temperatureMaxTime;
    private Float apparentTemperature;
    private Float apparentTemperatureMin;
    private Float apparentTemperatureMinTime;
    private Float apparentTemperatureMax;
    private Float apparentTemperatureMaxTime;
    private Float dewPoint;
    private Float windSpeed;
    private Float windBearing;
    private Float cloudCover;
    private Float humidity;
    private Float pressure;
    private Float visibility;
    private Float ozone;

    public Long getTime() {
        return time;
    }

    public String getSummary() {
        return summary;
    }

    public String getIcon() {
        return icon;
    }

    public Long getSunriseTime() {
        return sunriseTime;
    }

    public Long getSunsetTime() {
        return sunsetTime;
    }

    public Float getMoonPhase() {
        return moonPhase;
    }

    public Integer getNearestStormDistance() {
        return nearestStormDistance;
    }

    public Integer getNearestStormBearing() {
        return nearestStormBearing;
    }

    public Float getPrecipIntensity() {
        return precipIntensity;
    }

    public Float getPrecipIntensityMax() {
        return precipIntensityMax;
    }

    public Long getPrecipIntensityMaxTime() {
        return precipIntensityMaxTime;
    }

    public Float getPrecipProbability() {
        return precipProbability;
    }

    public String getPrecipType() {
        return precipType;
    }

    /*public String getPrecipAccumulation() {
        return precipAccumulation;
    }*/

    public Float getTemperature() {
        return temperature;
    }

    public Float getTemperatureMin() {
        return temperatureMin;
    }

    public Float getTemperatureMinTime() {
        return temperatureMinTime;
    }

    public Float getTemperatureMax() {
        return temperatureMax;
    }

    public Float getTemperatureMaxTime() {
        return temperatureMaxTime;
    }

    public Float getApparentTemperature() {
        return apparentTemperature;
    }

    public Float getApparentTemperatureMin() {
        return apparentTemperatureMin;
    }

    public Float getApparentTemperatureMinTime() {
        return apparentTemperatureMinTime;
    }

    public Float getApparentTemperatureMax() {
        return apparentTemperatureMax;
    }

    public Float getApparentTemperatureMaxTime() {
        return apparentTemperatureMaxTime;
    }

    public Float getDewPoint() {
        return dewPoint;
    }

    public Float getWindSpeed() {
        return windSpeed;
    }

    public Float getWindBearing() {
        return windBearing;
    }

    public Float getCloudClover() {
        return cloudCover;
    }

    public Float getHumidity() {
        return humidity;
    }

    public Float getPressure() {
        return pressure;
    }

    public Float getVisibility() {
        return visibility;
    }

    public Float getOzone() {
        return ozone;
    }
}
