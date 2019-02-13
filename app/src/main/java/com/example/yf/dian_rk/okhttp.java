package com.example.yf.dian_rk;

import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class okhttp {
    private String url ="http://172.17.8.100/small/commodity/v1/bannerShow";

    private String registerUrl="http://172.17.8.100/small/user/v1/register";

    private OkHttpClient okHttpClient;

    private Call call;

    public void okHttpGet(){
        okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String json = response.body().string();
                Log.i("aaa",json);
            }
        });
    }
    public void okHttpPost(){

    }
}
