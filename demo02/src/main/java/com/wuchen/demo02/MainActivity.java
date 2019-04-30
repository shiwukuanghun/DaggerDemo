package com.wuchen.demo02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    Product mProduct;
    @Inject
    Factory mFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //第一种方式
//        DaggerMainComponent.builder()
//                .build()
//                .inject(this);

        //第二种方式
//        DaggerMainComponent.create().inject(this);

        DaggerProductComponent.create().inject(this);

        Log.d(TAG, "onCreate: " + mProduct.hashCode());
        Log.e(TAG, "onCreate: " + mFactory.hashCode() + "   " + mFactory.mProduct.hashCode());
    }
}
