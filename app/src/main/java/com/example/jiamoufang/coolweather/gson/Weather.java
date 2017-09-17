package com.example.jiamoufang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by jiamoufang on 2017/9/16.
 */

public class Weather {
    /*返回状态*/
    public String  status;
    /*基本信息*/
    public Basic basic;
    /*空气质量*/
    public AQI aqi;
    /*现在状态*/
    public Now now;
    /*生活建议*/
    public Suggestion suggestion;
    /*未来几日的天气预报*/
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
