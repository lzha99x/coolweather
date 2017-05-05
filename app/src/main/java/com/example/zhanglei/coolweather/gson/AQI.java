package com.example.zhanglei.coolweather.gson;

/**
 * Created by zhanglei on 5/4/17.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
