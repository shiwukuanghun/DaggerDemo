package com.wuchen.daggerdemo;

import dagger.Component;

/**
 * Time：2019/4/22 16:58
 * Author：WuChen
 * Description：
 **/
@ActivityScope
@Component(modules = CommonModule.class)
public interface CommonComponent {
    void inject(LoginActivity loginActivity);
}
