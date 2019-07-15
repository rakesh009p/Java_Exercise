package com.stackroute.pe1;

import java.util.*;
//this program prints each vowel and consonent
public class VowelConsonentChecker{
    public static void main(String[] args) {
        int j=0;
        System.out.println("Enter a string :");
        //input string
        Scanner sc = new Scanner(System.in);
        String word= sc.nextLine();
        //condition to check vowel or consonent
        for(int i=0;i<word.length();i++){
            //checking first character in a string
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u') {
                System.out.println(word.charAt(i)+" is vowel");}
            else{
                System.out.println(word.charAt(i)+" is consonant");}
        }

    }
    //test case code
    public static String vowelConsChecker(String word) {

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                System.out.println(word.charAt(i) + " is vowel");
            } else {
                System.out.println(word.charAt(i) + " is consonant");
            }
        }
        return word;
    }
    //test code case
    public static String vowel(String word) {

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                System.out.println(word.charAt(i) + " is vowel");
                return "vowel";
            }
        }
        return word;
    }
}