package com.wuchen.scopedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Product mProduct1;
    @Inject
    Product mProduct2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.builder().build().inject(this);

        //使用@Singleton后，这两个是同一个
        Log.d("DaggerMainComponent", "onCreate: " + mProduct1.hashCode() + "   " + mProduct2.hashCode());
    }
}
