package com.stackroute.pe1;
import java.util.*;
public class Stringrepeat{
    public static void main(String[] args){
        Integer number=new Integer(19);
        int len ;
        Scanner scanner=null;
        Scanner sc= new Scanner(System.in);
        String g= sc.next();
        Scanner sca= new Scanner(System.in);
        int n= sca.nextInt();
        String x ="";
        String d="";
        len=g.length();
        for(int i=0;i<n;i++){
            for(int j=len-n;j<g.length();j++)
            {
                x=x+(g.charAt(j));}
        }
        System.out.println(g+x);

    }
}