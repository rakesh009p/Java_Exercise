package com.stackroute.pe1;
import java.util.*;
public class Stringreverser{
    //programs returns string in reverse
    public static void main(String[] args){

        System.out.println("Enter a string to revere it: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        //object creation
        Stringreverser stringreverser = new Stringreverser();
        stringreverser.reverse(string);}
        //test cases code

    public String reverse(String stringInput){
        if(stringInput==null){
            return "Should Not Be Null";
        }
        String stringInput1="";
        for(int j=stringInput.length()-1;j>=0;j--){
            stringInput1=stringInput1+stringInput.charAt(j);
        }System.out.println(stringInput1);
        //returning the reverse string
        return stringInput1;
    }
}