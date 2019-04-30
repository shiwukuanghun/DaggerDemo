package com.wuchen.daggerdemo;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * Time：2019/4/22 16:53
 * Author：WuChen
 * Description：
 **/
public class LoginPresenter {
    ICommonView iView;

    @Inject
    public LoginPresenter(ICommonView iView){
        this.iView = iView;
    }

    public void login(User user){
        Context mContext = iView.getContext();
        Toast.makeText(mContext,"login......",Toast.LENGTH_SHORT).show();
    }
}
