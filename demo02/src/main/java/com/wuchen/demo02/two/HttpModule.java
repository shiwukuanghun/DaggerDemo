package com.wuchen.demo02.two;

import dagger.Module;
import dagger.Provides;

/**
 * Time：2019/4/22 18:27
 * Author：WuChen
 * Description：
 **/
@Module
public class HttpModule {

    private int mCacheSize;

    public HttpModule(int cacheSize) {
        mCacheSize = cacheSize;
    }

    @Provides
    public OkHttpClient provideOkHttpClient() {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setCacheSize(mCacheSize);
        return okHttpClient;
    }

    @Provides
    public RetrofitManager provideRetrofitManager(OkHttpClient okHttpClient) {
        return new RetrofitManager(okHttpClient);
    }
}
