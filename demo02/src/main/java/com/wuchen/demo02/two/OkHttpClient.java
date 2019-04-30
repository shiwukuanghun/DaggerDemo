package com.wuchen.demo02.two;

import android.util.Log;

/**
 * Time：2019/4/22 18:05
 * Author：WuChen
 * Description：假设这是三方类库，不能改源码
 **/
public class OkHttpClient {

    private static final String TAG = "OkHttpClient";

    private int cacheSize;

    public OkHttpClient() {
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    public void print() {
        Log.d(TAG, "print: 输出OkHttpClient");
    }
}
