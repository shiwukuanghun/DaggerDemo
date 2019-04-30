package com.wuchen.componentdemo;

import dagger.Component;

/**
 * Time：2019/4/23 13:55
 * Author：WuChen
 * Description：被依赖的 Component 需要把暴露的依赖实例用显式的接口声明，如下面的Car car()，我们只能使用Man愿意分享的东西
 * 依赖关系中的 Component 的 Scope 不能相同，因为它们的生命周期不同
 **/
@ManScope
@Component(modules = ManModule.class)
public interface ManComponent {

    void inject(ManActivity manActivity);

    Car car();//必须向外提供Car依赖实例的接口，表明 Man 可以借 Car 给别人

}
