package com.wuchen.daggerdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, ICommonView {

    @Inject
    LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);

        DaggerCommonComponent.builder().commonModule(new CommonModule(this)).build().inject(this);
    }

    @Override
    public void onClick(View v) {
        mLoginPresenter.login(new User());
    }

    @Override
    public Context getContext() {
        return this;
    }
}
