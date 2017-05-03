package com.example.zhanglei.coolweather.util;

import android.text.TextUtils;

import com.example.zhanglei.coolweather.db.City;
import com.example.zhanglei.coolweather.db.County;
import com.example.zhanglei.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by zhanglei on 4/27/17.
 */

public class Utility {
    private static final String TAG = "Utility";
    /**
    * 解析和处理服务器返回的省级数据.
    * */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int index = 0; index < allProvinces.length(); index++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(index);
                    Province province = new Province();
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.setProvinceName(provinceObject.getString("name"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return  false;
    }

    /**
     * 解析和处理服务器返回的市级数据.
     * */
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCities = new JSONArray(response);
                for (int index = 0; index < allCities.length(); index++) {
                    JSONObject cityObject = allCities.getJSONObject(index);
                    City city = new City();
                    city.setCityCode(cityObject.getInt("id"));
                    city.setCityName(cityObject.getString("name"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     *解析和处理服务器返回的县级数据.
     * */
    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int index = 0; index < allCounties.length(); index++) {
                    JSONObject countyObject = allCounties.getJSONObject(index);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return  false;
    }
}
