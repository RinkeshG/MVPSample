package com.projects.rinkesh.mvpsample.ui.login;

import com.projects.rinkesh.mvpsample.Data.DataManager;
import com.projects.rinkesh.mvpsample.ui.base.BasePresenter;

/**
 * Created by Rinkesh on 04/12/17.
 */

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {

    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId) {
        getmDataManger().saveEmailId(emailId);
        getmDataManger().setLoggedIn();
        getmMvpView().openMainActivity();
    }
}
