package com.projects.rinkesh.mvpsample.ui.base;

/**
 * Created by Rinkesh on 04/12/17.
 */


// It is an interface that is implemented by BasePresenter, it acts as base presenter interface that is extended by all other presenter interfaces.

public interface MvpPresenter <V extends MvpView>{

    void onAttach(V mvpView);
}
