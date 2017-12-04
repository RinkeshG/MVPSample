package com.projects.rinkesh.mvpsample.ui.splash;

import com.projects.rinkesh.mvpsample.ui.base.MvpView;

/**
 * Created by Rinkesh on 04/12/17.
 */

// interface for the view which extends MvpView.

public interface SplashMvpView extends MvpView {

    void openMainActivity();

    void openLoginActivity();
}
