package com.stackroute.pe1;

import java.util.*;
public class CapitalChecker {
    //program is about returning case of a char
    public static void main(String[] args) {
        System.out.println("Enter Character");
        Scanner sc = new Scanner(System.in);
        //input char is given
        String str = sc.next();
        //character at first position
        char ch = str.charAt(0);
        int x = (int)ch;
        if (x >= 65 && x <= 90) {
            System.out.println("Capital Letter");
        } else {
            System.out.println("Small Letter");
        }
    }
    //code for test case-capital
    public String upperCase(char characterInput){
        int x = (int)characterInput;
        if (x >= 65 && x <= 90) {

        }
        return ("Capital");

        }
        //code for test case small
    public String lowerCase(char characterInput){
        int x = (int)characterInput;
        if (x <= 65 && x >= 90) {

        }
        return ("Small");

    }

    }


