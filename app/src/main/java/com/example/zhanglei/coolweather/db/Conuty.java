package com.example.zhanglei.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhanglei on 4/26/17.
 */

public class Conuty extends DataSupport {
    private int id;
    private String conutyName;
    private int cityId;
    private  String weatherId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setConutyName(String conutyName) {
        this.conutyName = conutyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getId() {
        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public String getConutyName() {
        return conutyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

}
