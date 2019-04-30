package com.wuchen.inheritdemo;

import dagger.Module;
import dagger.Provides;

/**
 * Time：2019/4/25 11:56
 * Author：WuChen
 * Description：
 **/
@Module
public class BikeModule {

    @SonScope
    @Provides
    public Bike provideBike() {
        return new Bike("Son的单车");
    }

}
