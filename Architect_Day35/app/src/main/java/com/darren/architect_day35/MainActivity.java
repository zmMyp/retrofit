package com.darren.architect_day35;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.darren.architect_day35.simple1.RetrofitClient;
import com.darren.architect_day35.simple1.UserInfo;
import com.darren.architect_day35.simple2.HttpCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RetrofitClient.getServiceApi().userLogin1("","")
                .enqueue(new HttpCallback<UserInfo>() {
                    @Override
                    public void onSucceed(UserInfo result) {

                    }

                    @Override
                    public void onError(String code, String msg) {

                    }
                });
    }
}
