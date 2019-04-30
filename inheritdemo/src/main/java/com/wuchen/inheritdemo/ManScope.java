package com.wuchen.inheritdemo;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Time：2019/4/25 11:21
 * Author：WuChen
 * Description：
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Scope
public @interface ManScope {
}
