package com.feicuiedu.retrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NetApi netApi =  NetClient.getInstance().getNetApi();
        Call<ResponseBody> call = netApi.users("yuanchaocs");
        call.enqueue(callback);
    }

    private Callback<ResponseBody> callback = new Callback<ResponseBody>() {
        @Override public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

        }

        @Override public void onFailure(Call<ResponseBody> call, Throwable t) {

        }
    };
}
