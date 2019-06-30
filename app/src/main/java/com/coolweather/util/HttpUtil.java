package com.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;


/*******从服务器端获取到所有县市的数据*******/

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();  //发起一条Http请求
        client.newCall(request).enqueue(callback);
    }
}
