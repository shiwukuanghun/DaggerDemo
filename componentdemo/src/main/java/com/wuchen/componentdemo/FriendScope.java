package com.wuchen.componentdemo;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Time：2019/4/23 13:52
 * Author：WuChen
 * Description：
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Scope
public @interface FriendScope {
}
