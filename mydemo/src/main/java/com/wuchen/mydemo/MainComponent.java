package com.wuchen.mydemo;

import dagger.Component;
import dagger.Module;

/**
 * Time：2019/4/25 15:37
 * Author：WuChen
 * Description：
 **/
@Component(modules = BikeModule.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);

}
