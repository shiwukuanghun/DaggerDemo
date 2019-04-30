package com.wuchen.scopedemo2;

import dagger.Module;
import dagger.Provides;

/**
 * Time：2019/4/23 13:40
 * Author：WuChen
 * Description：
 **/
@Module
public class CarModule {

    @Provides
    @MyScope
    public Car provideCar() {
        return new Car();
    }

}
