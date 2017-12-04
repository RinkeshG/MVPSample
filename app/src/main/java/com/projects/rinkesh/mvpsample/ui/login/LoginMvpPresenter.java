package com.projects.rinkesh.mvpsample.ui.login;

import com.projects.rinkesh.mvpsample.ui.base.MvpPresenter;

/**
 * Created by Rinkesh on 04/12/17.
 */

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String emailId);
}
