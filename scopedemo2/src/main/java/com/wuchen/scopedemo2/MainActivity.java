package com.wuchen.scopedemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car mCar1;
    @Inject
    Car mCar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.builder().build().inject(this);
        Log.d("DaggerMainComponent", "onCreate: " + mCar1.hashCode() + "   " + mCar2.hashCode());
    }
}
