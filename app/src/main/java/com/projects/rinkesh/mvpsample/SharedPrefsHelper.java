package com.projects.rinkesh.mvpsample;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Rinkesh on 04/12/17.
 */

public class SharedPrefsHelper {

    public static final String MY_PREFS = "MY_PREFS";

    public static final String EMAIL = "EMAIL";

    private SharedPreferences msharedPreferences;

    public SharedPrefsHelper(Context context) {
        msharedPreferences = context.getSharedPreferences(MY_PREFS, Context.MODE_PRIVATE);
    }

    public void clear() {
        msharedPreferences.edit().clear().apply();
    }

    public String putEmail(String email) {
        return msharedPreferences.getString(EMAIL, null);
    }

    public String getEmail() {
        return msharedPreferences.getString(EMAIL, null);
    }

    public boolean getLoggedInMode() {
        return msharedPreferences.getBoolean("Is Logged In", false);
    }

    public void setLoggedInMode(boolean loggedIn) {
        msharedPreferences.edit().putBoolean("Is Logged In", loggedIn).apply();
    }
}
