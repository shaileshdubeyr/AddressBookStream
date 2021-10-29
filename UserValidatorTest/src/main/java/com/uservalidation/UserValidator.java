package com.uservalidation;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class UserValidator {
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9+_.-]+[@]{1}[a-zA-Z0-9]+[.a-z]{4}([.a-zA-Z]{3})*$";
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-zA-Z]{3,15}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-zA-Z]{3,15}$";
    private static final String MOBILE_NO_PATTERN = "^[0-9]{2}[ ][0-9]{10}$";
    private static final String PASSWORD_PATTERN = "([!@#$%^&*()]?[A-Za-z0-9]+){8,}$";

    public boolean firstName(String firstName) {
        try {
            boolean mathPattern = Pattern.matches(FIRST_NAME_PATTERN, firstName);
            if(mathPattern == true)
                return mathPattern;
            else
                throw (new InputMismatchException("given Input is not correct"));
        }
        catch (InputMismatchException inputMismatch){
            System.out.println("Exception "+inputMismatch.getMessage());
            return  false;
        }
    }

    public boolean lastName(String lastName) {
        try {
            boolean mathPattern = Pattern.matches(LAST_NAME_PATTERN, lastName);
            if(mathPattern == true)
                return mathPattern;
            else
                throw (new InputMismatchException("given Input is not correct"));
        }
        catch (InputMismatchException inputMismatch){
            System.out.println("Exception "+inputMismatch.getMessage());
            return  false;
        }
    }

    public boolean mobileNumber(String mobileNumber) {
        try {
            boolean mathPattern = Pattern.matches(MOBILE_NO_PATTERN, mobileNumber);
        if(mathPattern == true)
            return mathPattern;
        else
            throw (new InputMismatchException("given Input is not correct"));
    }
    catch (InputMismatchException inputMismatch){
        System.out.println("Exception "+inputMismatch.getMessage());
        return  false;
        }
    }

    public boolean passwordTest(String password) {
        try {
            boolean mathPattern = Pattern.matches(PASSWORD_PATTERN, password);
            if(mathPattern == true)
                return mathPattern;
            else
                throw (new InputMismatchException("given Input is not correct"));
        }
        catch (InputMismatchException inputMismatch){
            System.out.println("Exception "+inputMismatch.getMessage());
            return  false;
        }
    }
    public boolean gmailTest(String email) {
        try {
            boolean mathPattern = Pattern.matches(EMAIL_PATTERN, email);
            if(mathPattern == true)
                return mathPattern;
            else
                throw (new InputMismatchException("given Input is not correct"));
        }
        catch (InputMismatchException inputMismatch){
            System.out.println("Exception "+inputMismatch.getMessage());
            return  false;
        }
    }
}
