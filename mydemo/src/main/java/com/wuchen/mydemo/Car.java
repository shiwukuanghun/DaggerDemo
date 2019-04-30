package com.wuchen.mydemo;

import javax.inject.Inject;

/**
 * Time：2019/4/25 15:36
 * Author：WuChen
 * Description：构造函数没有参数的才可以不写Module
 **/
public class Car {

    private String mCarName;

    @Inject
    public Car() {
    }

    public String getCarName() {
        return mCarName;
    }

    public void setCarName(String carName) {
        mCarName = carName;
    }
}
