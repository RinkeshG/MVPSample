package com.projects.rinkesh.mvpsample.ui.base;

import com.projects.rinkesh.mvpsample.Data.DataManager;

/**
 * Created by Rinkesh on 04/12/17.
 */

// It is base class for all the presenter that implements MvpPresenter and it is extended by all other presenter in the application

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mMvpView;

    DataManager mDataManager;

    public BasePresenter(DataManager dataManager) {
        mDataManager = dataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    public V getmMvpView() {
        return mMvpView;
    }

    public DataManager getmDataManager() {
        return mDataManager;
    }
 }
