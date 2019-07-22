package com.stackroute.pe1;
import java.util.*;
public class Stringrepeater {
    //program should repeat string according to input integer
    /* public static void main(String[] args) {

       Scanner scanner = null;
        Scanner sc = new Scanner(System.in);
        //taking string input
        System.out.println("enter a string");
        String g = sc.next();
        Scanner sca = new Scanner(System.in);
        //takin integer input
        System.out.println("enter a integer");
        int n = sca.nextInt();
    }*/

    public String concateString(int n, String g) {
        int len;
        String stringInput1 = "";
        String stringInput2 = "";
        len = g.length();
        //loop for printing string in loop
        if(g!=null){
        for (int i = 0; i < n; i++) {
            for (int j = len - n; j < g.length(); j++) {
                //storing the concatenated string in a variable

                stringInput1 = stringInput1 + (g.charAt(j));
            }
        }
        return (g + stringInput1);

    }return "Null is not allowed";}

}
