package com.wuchen.demo02;

import javax.inject.Inject;

/**
 * Time：2019/4/22 17:50
 * Author：WuChen
 * Description：构造函数不带参数的,自己写的类由于可以改源码，所以可以不写module，直接在方法上加@Inject
 **/
public class Product {

    @Inject
    public Product() {

    }

}
