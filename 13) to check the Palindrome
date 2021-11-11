package com.shrayansh;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a number to check: ");
        int num=in.nextInt();
        int temp=num;
        int n=0;
        while(temp>0) {
           int a = temp % 10;
            n = n * 10 + a;
            temp = temp / 10;
        }
            if (num == n) {
                System.out.println("number is palindrome");
            } else {
                System.out.println("number is not palindrome");
            }

    }
}
