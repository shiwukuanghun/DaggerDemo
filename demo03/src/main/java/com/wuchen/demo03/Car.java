package com.wuchen.demo03;

import javax.inject.Inject;

/**
 * Time：2019/5/13 9:24
 * Author：WuChen
 * Description：
 **/
public class Car {

    private String mName;

    @Inject
    public Car(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }
}
