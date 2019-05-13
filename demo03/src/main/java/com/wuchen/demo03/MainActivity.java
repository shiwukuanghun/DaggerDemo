package com.wuchen.demo03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerCarComponent.builder().build().inject(this);
        Log.d("DaggerCarComponent", "onCreate: " + mCar.getName());
    }
}
