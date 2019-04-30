package com.wuchen.scopedemo2;

import dagger.Component;

/**
 * Time：2019/4/23 13:41
 * Author：WuChen
 * Description：
 **/
@MyScope
@Component(modules = CarModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
