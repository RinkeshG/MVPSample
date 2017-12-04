package com.projects.rinkesh.mvpsample.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.projects.rinkesh.mvpsample.Data.DataManager;
import com.projects.rinkesh.mvpsample.R;

import com.projects.rinkesh.mvpsample.ui.base.BaseActivity;
import com.projects.rinkesh.mvpsample.ui.login.LoginActivity;
import com.projects.rinkesh.mvpsample.ui.main.MainActivity;

import org.jetbrains.annotations.Nullable;

/**
 * Created by Rinkesh on 04/12/17.
 */

public class SplashActivity extends BaseActivity implements  SplashMvpView {

    SplashPresenter mSplashPresenter;

    public static Intent getStartIntent(Context context) {
        return new Intent(context, SplashActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    DataManager dataManager = ((MvpApp) getApplication()).getDataManger();

    mSplashPresenter = new SplashPresenter(dataManager);

        mSplashPresenter.onAttach(this);

        mSplashPresenter.decideNextActivity();


    @Override
    public void openMainActivity() {

        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();

    }

    @Override
    public void openLoginActivity() {

        Intent intent =  LoginActivity.getStartIntent(this);
        startActivity(intent);
        finish();

    }
}
