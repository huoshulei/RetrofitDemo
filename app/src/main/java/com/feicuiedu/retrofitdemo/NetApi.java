package com.feicuiedu.retrofitdemo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * 作者：yuanchao on 2016/8/16 0016 10:13
 * 邮箱：yuanchao@feicuiedu.com
 */
public interface NetApi {
    @GET("http://www.baidu.com")
    Call<ResponseBody> baidu();

    @GET("https://api.github.com/users/{name}")
    Call<ResponseBody> users(@Path("name") String userName);

    @GET("https://api.github.com/search/users")
    Call<ResponseBody> searchUsers(@Query("q") String ssss);

    @Headers({
            "X-Bmob-Application-Id:623aaef127882aed89b9faa348451da3",
            "X-Bmob-REST-API-Key:c00104962a9b67916e8cbcb9157255de",
            "Content-Type:application/json"
    })
    @POST("https://api.bmob.cn/1/users")
    //Call<ResponseBody> register(@Body RequestBody body);
    Call<UserResult> register(@Body User body);
}
