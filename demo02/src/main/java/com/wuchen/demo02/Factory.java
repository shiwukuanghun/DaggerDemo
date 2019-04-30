package com.wuchen.demo02;

import javax.inject.Inject;

/**
 * Time：2019/4/22 17:55
 * Author：WuChen
 * Description：
 **/
public class Factory {

    Product mProduct;

    @Inject
    public Factory(Product product) {
        mProduct = product;
    }
}
