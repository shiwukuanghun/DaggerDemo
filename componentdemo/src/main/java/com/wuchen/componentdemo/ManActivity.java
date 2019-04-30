package com.wuchen.componentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class ManActivity extends AppCompatActivity {

    @Inject
    Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man);

        DaggerManComponent.builder().build().inject(this);
        Log.d("DaggerManComponent", "onCreate: " + mCar.hashCode());
    }
}
