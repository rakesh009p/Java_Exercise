package com.stackroute.pe1;



import java.util.*;
public class Palindromechecker{
    //program checks given integer is a palindrome or not
    public static void main(String args[]){
        int x=0,sum=0,temp,rem;
        //integer input
        System.out.println("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        temp=n;
        while(n>0){
            rem=n%10;
            //code for even number
            if(rem%2==0){
                x=x+rem;
                //code for even number ends
            }
            //sum is the variable which tells status
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else{
            System.out.println("not palindrome");}
        System.out.println(x);
    }
    //code for test cases
    public String palindromeCheck(int palindrome){
        int temp,rem,sum=0;
        temp=palindrome;
        while(palindrome>0){
            rem=palindrome%10;
            sum=(sum*10)+rem;
            palindrome=palindrome/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        return "palindrome";
    }
    //code for another test case
    public String notAPalindromeCheck(int palindrome){
        int temp,rem,sum=0;
        temp=palindrome;
        while(palindrome>0){
            rem=palindrome%10;
            sum=(sum*10)+rem;
            palindrome=palindrome/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not a palindrome");
        return "not a palindrome";
    }
}

