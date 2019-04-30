package com.wuchen.mydemo;

import dagger.Module;
import dagger.Provides;

/**
 * Time：2019/4/25 15:49
 * Author：WuChen
 * Description：
 **/
@Module
public class BikeModule {

    /**
     * 如果方法中有参数，要赋值给它的话就要在Module中提供一个对应返回值的方法
     * @param bikeName
     * @return
     */
    @Provides
    static Bike provideBike(String bikeName) {
        return new Bike(bikeName);
    }

    @Provides
    public String provideName() {
        return "凤凰牌自行车";
    }

}
