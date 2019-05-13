package com.wuchen.demo03;

import dagger.Module;
import dagger.Provides;

/**
 * Time：2019/5/13 9:25
 * Author：WuChen
 * Description：
 **/
@Module
public class CarModule {

    @Provides
    public String setName() {
        return "虎式坦克";
    }

}
