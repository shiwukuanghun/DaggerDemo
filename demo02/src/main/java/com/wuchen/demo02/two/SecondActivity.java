package com.wuchen.demo02.two;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.wuchen.demo02.R;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Inject
    OkHttpClient mOkHttpClient;  //不能是私有的，会报错

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        DaggerOkHttpComponent.builder().build().inject(this);

        mOkHttpClient.print();
//        Log.d(TAG, "onCreate: " + mOkHttpClient.hashCode());
    }
}
