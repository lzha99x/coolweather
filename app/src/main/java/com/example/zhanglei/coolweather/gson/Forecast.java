package com.example.zhanglei.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhanglei on 5/4/17.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperture temperture;

    @SerializedName("cond")
    public More more;

    public class Temperture {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_id")
        public String info;
    }
}
