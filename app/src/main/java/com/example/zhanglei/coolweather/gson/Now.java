package com.example.zhanglei.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhanglei on 5/4/17.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
