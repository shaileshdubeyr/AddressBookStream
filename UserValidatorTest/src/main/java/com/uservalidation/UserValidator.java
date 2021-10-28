package com.uservalidation;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserValidator {
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-zA-Z]{3,15}$";

    public boolean firstName(String firstName) {
        boolean mathPattern = Pattern.matches(FIRST_NAME_PATTERN, firstName);
        return mathPattern;
    }
}
