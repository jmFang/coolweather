package com.example.jiamoufang.coolweather.gson;

/**
 * Created by jiamoufang on 2017/9/16.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
