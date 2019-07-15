package com.stackroute.pe1;
import java.util.*;
public class Guessnumber {
    //program is about comparing te given integer with user given integer
    public static void main(String[] args){
        int x=34;
        System.out.println("Guess a Number: ");
        Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        //input should be between 1 to 50
        if (input >= 1 && input <= 50) {
            //if given input is equal
            if(input==x) {
                System.out.println("The number you entered is "+input+" and is guessed properly");
            }
            //if given input is greater
            else if(input>x) {
                System.out.println("The number you entered is"+input+"and is "+(input-x)+" greater than the original number");
            }
            //if given input is smaller
            else if(input<x) {
                System.out.println("The number you entered is"+input+"and is "+(x-input)+" Lesser than the original number");
            }

        }
        //if it is not in range
        else {
            System.out.println("Given Number is not in the bounds,give a number that is greater than 1 and less than 50");
        }

    }
    //test cases code
    public String compareInt(int input){
        if(input==34)
            return "guessed properly";
        else
            return ("none");
    }
    //test case code
    public String greaterInt(int input){
        if (input>34)
            return "greater than the original number" ;
        else
            return ("none");
    }
    //test case code
    public String smallerInt(int input){
        //comparing
        if (input<34)
            return "smaller than the original number" ;
        else
            return ("none");
    }
}