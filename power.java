package com.shrayansh;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
        System.out.print("enter the number: ");
        double n= in.nextDouble();
        System.out.print("enter the power: ");
        double p=in.nextDouble();
        System.out.print("Number with power: "+Math.pow(n,p));
    }
}
