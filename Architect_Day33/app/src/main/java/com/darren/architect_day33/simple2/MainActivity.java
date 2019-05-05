package com.darren.architect_day33.simple2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.darren.architect_day33.R;
import com.darren.architect_day33.simple1.RetrofitClient;
import com.darren.architect_day33.simple1.UserInfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // OkHttp +RxJava + Retrofit
        RetrofitClient.getServiceApi().userLogin("Darren","940223")
                .enqueue(new HttpCallback<UserInfo>(){
                    @Override
                    public void onSucceed(UserInfo result) {
                        // 成功
                        Toast.makeText(MainActivity.this,"成功"+result.toString(),Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onError(String code, String msg) {
                        // 失败
                        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();
                    }
                });
    }
}
