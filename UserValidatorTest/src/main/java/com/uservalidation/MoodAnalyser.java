package com.uservalidation;

public class MoodAnalyser {
    public String messageContainHappyReturnHappyElseSad(String message) {
        if(message.contains("Sad"))
            return "Sad";
        else
            return "Happy";
    }
}
