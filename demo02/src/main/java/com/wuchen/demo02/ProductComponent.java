package com.wuchen.demo02;

import dagger.Component;
import dagger.Provides;

/**
 * Time：2019/4/22 17:51
 * Author：WuChen
 * Description：
 **/
@Component
public interface ProductComponent {

    void inject(MainActivity mainActivity);

}
