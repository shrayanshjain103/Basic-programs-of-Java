package com.shrayansh;

import java.util.Scanner;

public class compoundinterest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        float p=in.nextFloat();
        System.out.print("Enter the Interest  Rate: ");
        float r=in.nextFloat();
        System.out.print("Enter the number of times interest is compounded per year:  ");
        float n=in.nextFloat();
        System.out.print("Enter the time: ");
        float t=in.nextFloat();
        float A=(float) (p*Math.pow(1+r/n,n*t));
        System.out.print("Compound Interest is: "+A);
    }
}
