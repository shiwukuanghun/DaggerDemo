package com.wuchen.componentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class FriendActivity extends AppCompatActivity {

    @Inject
    Car mCar1;
    @Inject
    Car mCar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);
        ManComponent manComponent = DaggerManComponent.builder().manModule(new ManModule("俺的车")).build();
//        DaggerFriendComponent.builder().friendModule(manComponent).build().inject(this);
        DaggerFriendComponent.builder().manComponent(manComponent).build().inject(this);
        Log.d("DaggerFriendComponent", "onCreate: " + mCar1.hashCode() + "   " + mCar2.hashCode() + mCar1.getCarName());

    }
}
