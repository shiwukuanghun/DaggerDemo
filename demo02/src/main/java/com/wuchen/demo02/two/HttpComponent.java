package com.wuchen.demo02.two;

import dagger.Component;

/**
 * Time：2019/4/22 18:32
 * Author：WuChen
 * Description：
 **/
@Component(modules = HttpModule.class)
public interface HttpComponent {
    void inject(HttpActivity httpActivity);
}
