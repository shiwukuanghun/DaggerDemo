package com.wuchen.daggerdemo;

import dagger.Module;
import dagger.Provides;

/**
 * Time：2019/4/22 16:57
 * Author：WuChen
 * Description：
 **/
@Module
public class CommonModule {

   private ICommonView mICommonView;

    public CommonModule(ICommonView ICommonView) {
        mICommonView = ICommonView;
    }

    @Provides
    @ActivityScope
    public ICommonView provideICommonView() {
        return mICommonView;
    }
}
