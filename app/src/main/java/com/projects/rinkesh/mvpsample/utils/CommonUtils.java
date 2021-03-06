package com.projects.rinkesh.mvpsample.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rinkesh on 04/12/17.
 */

// In the login activity we will be needing to verify email provided by users, following the architecture we can create this method in CommonUtils too.

public class CommonUtils {

    public static boolean isEmailValid(String email) {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN =
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
