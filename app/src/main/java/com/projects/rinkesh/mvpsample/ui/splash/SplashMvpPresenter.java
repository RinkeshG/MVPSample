package com.projects.rinkesh.mvpsample.ui.splash;

import com.projects.rinkesh.mvpsample.ui.base.MvpPresenter;

/**
 * Created by Rinkesh on 04/12/17.
 */

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();
}
