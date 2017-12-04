package com.projects.rinkesh.mvpsample.ui.base;

/**
 * Created by Rinkesh on 04/12/17.
 */

// It is an interface that is implemented by BasePresenter,
// it acts as base presenter interface by all other presenter interface

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);
}
