package com.feicuiedu.retrofitdemo;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 作者：yuanchao on 2016/8/16 0016 10:36
 * 邮箱：yuanchao@feicuiedu.com
 */
public class NetClient {
    private static NetClient sInstance;

    public static synchronized NetClient getInstance() {
        if (sInstance == null) {
            sInstance = new NetClient();
        }
        return sInstance;
    }

    private NetApi netApi;

    private NetClient() {
        // 日志拦截器
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor) // 打印日志的拦截器
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.bmob.cn")
                .client(okHttpClient)
                // 添加转换器
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        netApi = retrofit.create(NetApi.class);
    }

    public NetApi getNetApi() {
        return netApi;
    }
}
