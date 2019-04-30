package com.wuchen.demo02.two;

import dagger.Component;

/**
 * Time：2019/4/22 18:09
 * Author：WuChen
 * Description：
 **/
@Component(modules = OkHttpModule.class)
public interface OkHttpComponent {

    void inject(SecondActivity secondActivity);

}
