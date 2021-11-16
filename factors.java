package com.shrayansh;

import java.util.Scanner;

public class factors{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=in.nextInt();
        int i;
        int a=0;
        System.out.print("factors are: ");
        for (i = 1; i <=n; i++) {
           if(n%i==0){
               a=i;
               System.out.print( " "+a);
        }
        }
    }
}