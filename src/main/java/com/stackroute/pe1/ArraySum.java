package com.stackroute.pe1;

import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:" + sum);
    }
    public int arrayAdder(int n,int a[]){
        int sum=0;
        for (int i = 0; i < n; i++) {

            sum = sum + a[i];
        }
        System.out.println("Sum:" + sum);
        return sum;
    }

    }

