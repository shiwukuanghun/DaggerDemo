package com.wuchen.scopedemo2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Time：2019/4/23 13:37
 * Author：WuChen
 * Description：
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Scope
public @interface MyScope {
}
