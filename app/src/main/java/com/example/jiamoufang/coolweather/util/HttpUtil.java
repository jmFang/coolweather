package com.example.jiamoufang.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by jiamoufang on 2017/9/16.
 * fetch data from service
 */

public class HttpUtil {
    public static void sendOkHttpRequest(final String address, final okhttp3.Callback callback) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder().url(address).build();
                client.newCall(request).enqueue(callback);
            }
        }).start();

    }
}
