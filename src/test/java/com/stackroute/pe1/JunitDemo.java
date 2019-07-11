package com.stackroute.pe1;

public class JunitDemo {
    public String concatAndUpperCase(String str1, String str2) {
        if (str1 == null || str2 == null)
            return ("null value is not allowed");
        String concattedString = str1.concat(str2);
        return concattedString.toUpperCase();
    }

    public String reverseString(String str) {
        if (str == null) {
            return ("null value is not allowed");
        }
        StringBuilder rev = new StringBuilder(str);
        return rev.reverse().toString();
    }
}




