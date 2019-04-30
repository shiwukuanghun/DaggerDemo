package com.wuchen.scopedemo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Time：2019/4/23 11:08
 * Author：WuChen
 * Description：
 **/
@Singleton
@Component
public interface MainComponent {

    void inject(MainActivity mainActivity);

}
