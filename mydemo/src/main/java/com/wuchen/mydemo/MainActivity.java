package com.wuchen.mydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car mCar;
    @Inject
    Bike mBike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.builder().build().inject(this);
//        BikeModule.provideBike("凤凰牌自行车");
        mCar.setCarName("坦克");
        Log.d("DaggerMainComponent", "onCreate: " + mBike.getBikeName() + mCar.getCarName());
    }
}
