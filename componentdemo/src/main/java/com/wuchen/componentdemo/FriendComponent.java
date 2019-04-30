package com.wuchen.componentdemo;

import dagger.Component;

/**
 * Time：2019/4/23 13:56
 * Author：WuChen
 * Description：依赖关系中的 Component 的 Scope 不能相同，因为它们的生命周期不同
 **/
@FriendScope
@Component(dependencies = ManComponent.class)
public interface FriendComponent {

    void inject(FriendActivity friendActivity);

}
