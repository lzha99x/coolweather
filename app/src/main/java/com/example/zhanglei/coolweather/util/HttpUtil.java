package com.example.zhanglei.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zhanglei on 4/27/17.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        // 创建一个OkHttpClient实例
        OkHttpClient client = new OkHttpClient();
        // 创建一个Request 对象.
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
