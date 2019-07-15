package com.stackroute.pe1;
import java.util.*;
//program checks given integer is even or odd and returns tom or jerry
public class Evenoddchecker{
    //declaring main method
    public static void main(String[] args){
        //input integer
        System.out.println("enter the number");
        Scanner scn=new Scanner(System.in);

        int x=scn.nextInt();
        //input should be between 20 and 30
        if(x>20&&x<30){
            if(x%2==0){
                System.out.println("tom");}
            else{
                System.out.println("jerry");
            }}
        else{
            System.out.println("not in range");}
    }

//code for test cases

        public int compareeven(int input){

            if(input>20&&input<30){
                if(input%2==0){
                    System.out.println("jerry");
                }
                else{
                    System.out.println("tom");
                }
            }
            return input;
        }
    }