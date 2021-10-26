package com.uservalidation;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserValidator {
    public boolean gMail(String gmail) {
        System.out.println("Email Testing");
        boolean matchesString = Pattern.matches("^[A-Za-z._]+[@]{1}[a-zA-Z]+[.a-z]{4}([.a-zA-Z]{3})*$", gmail);
        return matchesString;
    }
}
