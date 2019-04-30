package com.wuchen.demo02.two;

import dagger.Module;
import dagger.Provides;

/**
 * Time：2019/4/22 18:08
 * Author：WuChen
 * Description：
 **/
@Module
public class OkHttpModule {

    @Provides
    OkHttpClient provideOkHttpClient() {
        return new OkHttpClient();
    }

}
