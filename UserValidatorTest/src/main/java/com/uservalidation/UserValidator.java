package com.uservalidation;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserValidator {
    public boolean mobileNumber(String number) {
        boolean matchesString = Pattern.matches("^[0-9]{2}[ ][0-9]{10}$", number);
        return matchesString;
    }
}
