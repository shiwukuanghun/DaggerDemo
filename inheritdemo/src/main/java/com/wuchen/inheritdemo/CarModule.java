package com.wuchen.inheritdemo;

import dagger.Module;
import dagger.Provides;

/**
 * Time：2019/4/25 11:54
 * Author：WuChen
 * Description：
 **/
@Module
public class CarModule {

    @Provides
    @ManScope
    public Car provideCar() {
        return new Car("Man的车");
    }

}
