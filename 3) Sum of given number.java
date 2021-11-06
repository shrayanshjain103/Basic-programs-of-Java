package com.shrayansh;

import java.util.Scanner;

    public class sum {
        public static void main(String[] args) {
          Scanner Input= new Scanner(System.in);
            System.out.print("enter two numbers: ");
           int num1= Input.nextInt();
           int num2= Input.nextInt();
           int sum= num1 + num2;
            System.out.println("sum is: " + sum);
        }
    }
