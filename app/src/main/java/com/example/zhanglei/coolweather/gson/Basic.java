package com.example.zhanglei.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhanglei on 5/4/17.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public  class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
