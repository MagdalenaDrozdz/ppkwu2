package com.example.demo.serwis;

import java.util.ArrayList;
import java.util.HashMap;

@org.springframework.stereotype.Service

public class Serwis {
    public String checkString(String string) {
        HashMap hashMap = new HashMap();

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
        hashMap.put("upperLetters", upperLetters);
        hashMap.put("lowerLetters", lowerLetters);
        hashMap.put("numbers", numbers);
        hashMap.put("others", others);

        return string;
    }
}
