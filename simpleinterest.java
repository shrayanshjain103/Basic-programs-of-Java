package com.shrayansh;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        float SI=0;
        System.out.print("enter the Principal: ");
        float p=in.nextFloat();
        System.out.print("enter the Rate of interest: ");
        float r=in.nextFloat();
        System.out.print("enter the time: ");
        float t=in.nextFloat();
        SI=(p*r*t)/100;
        System.out.print("Simple interest is: "+SI);

    }
}
