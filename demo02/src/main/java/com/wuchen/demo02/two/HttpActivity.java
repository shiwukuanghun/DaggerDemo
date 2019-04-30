package com.wuchen.demo02.two;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.wuchen.demo02.R;

import javax.inject.Inject;

public class HttpActivity extends AppCompatActivity {

    @Inject
    RetrofitManager mRetrofitManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http);

        //在Module的构造函数带有参数且参数被使用的情况下，所生产的Component类就没有create()方法了
        DaggerHttpComponent.builder().httpModule(new HttpModule(100)).build().inject(this);
        Log.d("OkHttpClient", "onCreate: " + mRetrofitManager.getOkHttpClient().getCacheSize());
    }
}
