package com.example.demo.serwis;

import java.util.ArrayList;
import java.util.HashMap;

@org.springframework.stereotype.Service

public class Serwis {
    public HashMap checkString(String string) {
        HashMap infoAboutString = new HashMap();

        int upperLetters = 0;
        int lowerLetters = 0;
        int numbers = 0;
        int others = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                upperLetters+=1;
            } else if (Character.isLowerCase(string.charAt(i))) {
                lowerLetters+=1;
            } else if (Character.isDigit(string.charAt(i))) {
                numbers+=1;
            } else {
                others+=1;
            }
        }
        infoAboutString.put("upperLetters", upperLetters);
        infoAboutString.put("lowerLetters", lowerLetters);
        infoAboutString.put("numbers", numbers);
        infoAboutString.put("others", others);

        return infoAboutString;
    }
}
