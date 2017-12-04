package com.projects.rinkesh.mvpsample.ui.main;

import com.projects.rinkesh.mvpsample.ui.base.MvpPresenter;
import com.projects.rinkesh.mvpsample.ui.base.MvpView;

/**
 * Created by Rinkesh on 04/12/17.
 */

public interface MainMvpPresenter<V extends MainMvpView & MvpView> extends MvpPresenter<V> {

    String getEmailId();

    void setUserLoggedOut();

}