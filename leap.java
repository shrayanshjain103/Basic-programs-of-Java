package com.shrayansh;

import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
          System.out.println("enter a year to check: ");
          int year= input.nextInt();
          if(((year%4==0) && (year%100!=0) || (year%400==0))){
              System.out.println("leap year");
          }
          else{
              System.out.println(" not a leap year");
          }

    }
}
