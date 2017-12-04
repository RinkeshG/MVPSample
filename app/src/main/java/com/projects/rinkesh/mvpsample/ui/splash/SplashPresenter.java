package com.projects.rinkesh.mvpsample.ui.splash;

import com.projects.rinkesh.mvpsample.Data.DataManager;
import com.projects.rinkesh.mvpsample.ui.base.BasePresenter;

/**
 * Created by Rinkesh on 04/12/17.
 */

public class SplashPresenter <V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getmDataManger().getLoggedInMode()) {
            getmMvpView().openMainActivity();
        } else {
            getmMvpView().openLoginActivity();
        }
    }
}
