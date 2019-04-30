package com.wuchen.demo02.two;

/**
 * Time：2019/4/22 18:06
 * Author：WuChen
 * Description：假设这是三方类库，不能改源码
 **/
public class RetrofitManager {

    private OkHttpClient mOkHttpClient;

    public RetrofitManager(OkHttpClient okHttpClient) {
        mOkHttpClient = okHttpClient;
    }

    public OkHttpClient getOkHttpClient() {
        return mOkHttpClient;
    }

    public void setOkHttpClient(OkHttpClient okHttpClient) {
        mOkHttpClient = okHttpClient;
    }
}
