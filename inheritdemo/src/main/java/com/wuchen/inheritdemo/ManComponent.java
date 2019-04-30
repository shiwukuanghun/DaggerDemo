package com.wuchen.inheritdemo;

import dagger.Component;

/**
 * Time：2019/4/25 11:55
 * Author：WuChen
 * Description： 继承关系中不用显式地提供暴露依赖实例的接口
 **/
@ManScope
@Component(modules = CarModule.class)
public interface ManComponent {

    void inject(ManActivity manActivity);

    SonComponent.Builder sonComponent(); //用来创建SubComponent

}
