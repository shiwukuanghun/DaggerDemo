package com.wuchen.demo03;

import dagger.Component;

/**
 * Time：2019/5/13 9:26
 * Author：WuChen
 * Description：
 **/
@Component(modules = CarModule.class)
public interface CarComponent {

    void inject(MainActivity mainActivity);

}
