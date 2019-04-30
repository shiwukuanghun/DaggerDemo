package com.wuchen.inheritdemo;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Time：2019/4/25 11:58
 * Author：WuChen
 * Description：
 **/
@SonScope
@Subcomponent(modules = BikeModule.class)
public interface SonComponent {

    void inject(SonActivity sonActivity);

    @Subcomponent.Builder
    interface Builder {
        // SubComponent 必须显式地声明 Subcomponent.Builder，parent Component 需要用 Builder 来创建 SubComponent
        SonComponent build();
    }

}
