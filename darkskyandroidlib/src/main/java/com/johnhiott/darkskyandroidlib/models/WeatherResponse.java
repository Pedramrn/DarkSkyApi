package com.johnhiott.darkskyandroidlib.models;

import java.util.List;

public class WeatherResponse {

    private Double latitude;
    private Double longitude;
    private String timezone;
    private Float offset;
    private DataPoint currently;
    private DataBlock minutely;
    private DataBlock hourly;
    private DataBlock daily;
    private List<AlertsBlock> alerts;

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public Float getOffset() {
        return offset;
    }

    public DataPoint getCurrently() {
        return currently;
    }

    public DataBlock getMinutely() {
        return minutely;
    }

    public DataBlock getHourly() {
        return hourly;
    }

    public DataBlock getDaily() {
        return daily;
    }

    public List<AlertsBlock> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<AlertsBlock> alerts) {
        this.alerts = alerts;
    }
}
