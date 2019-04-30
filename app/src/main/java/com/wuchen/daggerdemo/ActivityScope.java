package com.wuchen.daggerdemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Time：2019/4/22 16:56
 * Author：WuChen
 * Description：
 **/
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {
}
