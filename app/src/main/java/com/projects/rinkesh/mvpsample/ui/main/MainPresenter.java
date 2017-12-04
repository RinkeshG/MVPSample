package com.projects.rinkesh.mvpsample.ui.main;

import com.projects.rinkesh.mvpsample.Data.DataManager;
import com.projects.rinkesh.mvpsample.ui.base.BasePresenter;
import com.projects.rinkesh.mvpsample.ui.base.MvpView;

/**
 * Created by Rinkesh on 04/12/17.
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getmDataManger().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
        getmDataManger().clear();
        getmMvpView().openSplashActivity();
    }

}