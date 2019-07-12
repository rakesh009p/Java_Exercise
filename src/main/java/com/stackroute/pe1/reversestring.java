package com.stackroute.pe1;
import java.util.*;
public class reversestring{
//    public static void main(String[] args){
//
//        System.out.println("Enter a string to revere it: ");
//        Scanner sc = new Scanner(System.in);
//        String g = sc.nextLine();
//        reversestring n = new reversestring();
//        n.reverse(g);}

    public String reverse(String h){
        if(h==null){
            return "Should Not Be Null";
        }
        String x="";
        for(int j=h.length()-1;j>=0;j--){
            x=x+h.charAt(j);
        }System.out.println(x);
        return x;
    }
}