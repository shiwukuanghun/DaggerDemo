package com.wuchen.componentdemo;

import dagger.Module;
import dagger.Provides;

/**
 * Time：2019/4/23 13:53
 * Author：WuChen
 * Description：
 **/
@Module
public class ManModule {

    private String mCarName;

    public ManModule(String carName) {
        mCarName = carName;
    }

    @Provides
    @ManScope
    public Car provideCar() {
        return new Car(mCarName);
    }

}
