package com.stackroute.pe1;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Arraysorter {
    //program is about sorts array elements in descending order and does sum of even numbers
    public static void main(String[] args) {
        int n, m, temp, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        //taking elements into the array
        int a[] = new int[n];
        System.out.print("Enter elements in array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
    }

    public int arraySort(int n, int data[]) {
        if (data == null) {
            return 0;
        } else {
            int temp, sum = 0, m;
            for (int i = 0; i < n; i++) {


                for (int j = i + 1; j < n; j++) {
                    // storing the values in temp variable for sorting
                    if (data[i] < data[j]) {
                        temp = data[i];
                        data[i] = data[j];
                        data[j] = temp;
                    }
                }
                //even numbers sum code starts

                m = data[i];
                if (m % 2 == 0) {
                    sum = sum + m;
                }
                //even number sum code ends


            }
            //test cases code for sorting

            System.out.print("Descending Order:");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(data[i] + ",");
            }

            System.out.print(data[n - 1]);
            System.out.println("\n");
            System.out.println("Sum of even numbers:" + sum);
            return sum;
        }
    }
}
