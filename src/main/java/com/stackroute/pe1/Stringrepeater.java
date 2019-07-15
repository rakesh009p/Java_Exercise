package com.stackroute.pe1;
import java.util.*;
public class Stringrepeater{
    //program should repeat string according to input integer
    public static void main(String[] args){
        int len ;
        Scanner scanner=null;
        Scanner sc= new Scanner(System.in);
        //taking string input
        System.out.println("enter a string");
        String g= sc.next();
        Scanner sca= new Scanner(System.in);
        //takin integer input
        System.out.println("enter a integer");
        int n= sca.nextInt();
        String stringInput1 ="";
        String stringInput2="";
        len=g.length();
        //loop for printing string in loop
        for(int i=0;i<n;i++){
            for(int j=len-n;j<g.length();j++)
            {
                //storing the concatenated string in a variable

                stringInput1=stringInput1+(g.charAt(j));}
        }
        System.out.println(g+stringInput1);

    }

}