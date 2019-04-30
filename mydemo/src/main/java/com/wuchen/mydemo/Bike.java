package com.wuchen.mydemo;

import javax.inject.Inject;

/**
 * Time：2019/4/25 15:48
 * Author：WuChen
 * Description：如果是构造函数带参数的，则一定要创建对应的Module类
 **/
public class Bike {

    private String mBikeName;

    public Bike() {
    }

    public Bike(String bikeName) {
        mBikeName = bikeName;
    }

    public String getBikeName() {
        return mBikeName;
    }
}
