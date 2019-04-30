package com.wuchen.inheritdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

/**
 * 继承关系和依赖关系最大的区别就是：继承关系中不用显式地提供依赖实例的接口，SubComponent 继承 parent Component 的所有依赖。
 * 依赖关系 vs 继承关系
 * 相同点：
 * 两者都能复用其他 Component 的依赖
 *
 * 有依赖关系和继承关系的 Component 不能有相同的 Scope
 *
 * 区别：
 * 依赖关系中被依赖的 Component 必须显式地提供公开依赖实例的接口，而 SubComponent 默认继承 parent Component 的依赖。
 * 依赖关系会生成两个独立的 DaggerXXComponent 类，而 SubComponent 不会生成 独立的 DaggerXXComponent 类。
 *
 */
public class SonActivity extends AppCompatActivity {

    @Inject
    Car mCar;
    @Inject
    Bike mBike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_son);

        ManComponent manComponent = DaggerManComponent.builder().build();
        manComponent.sonComponent().build().inject(this);

        Log.d("ManComponent", "onCreate: " + mCar.getCarName() + "   " + mBike.getBikeName());
    }
}
