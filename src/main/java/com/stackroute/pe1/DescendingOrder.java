package com.stackroute.pe1;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args){
        int n,m,temp,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.print("Enter elements in array:");
        for(int i=0;i<n;i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++){


            for (int j = i + 1; j < n; j++)
            {


                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

            m=a[i];
            if(m%2==0){
                sum=sum+m;
            }



        }

        System.out.print("Descending Order:");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print(a[i] + ",");
        }

        System.out.print(a[n - 1]);
        System.out.println("\n");
        System.out.println("Sum of even numbers:"  + sum);
    }
}