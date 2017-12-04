package com.projects.rinkesh.mvpsample;

import android.app.Application;

import com.projects.rinkesh.mvpsample.Data.DataManager;
import com.projects.rinkesh.mvpsample.Data.SharedPrefsHelper;

/**
 * Created by Rinkesh on 04/12/17.
 */

public class MvpApp extends Application{

    DataManager dataManager;

    @Override

    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);
    }

    public DataManager getDataManager() {
        return dataManager;
    }
}
