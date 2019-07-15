package com.stackroute.pe1;

import java.util.*;
//this program prints the integer in a loop according to input
public class Numberloop {

    public static void main(String[] args){
        int i,j;
        //input integer
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //loop execution for number to print in loop
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.println(i);
            }
        }
    }
    //test case code
    public int numberRepeater(int input){
        int i, j,count=0;

        for(i = 1; i <= input; i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.println(i);
                count++;
            }

        }
return count;
    }



}