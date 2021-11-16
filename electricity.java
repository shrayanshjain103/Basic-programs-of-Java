package com.shrayansh;

import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the amount of reading: ");
        float r=in.nextFloat();
        System.out.print("enter the rate of one reading: ");
        float rate=in.nextFloat();
        float bill=r*rate;
        System.out.println("The bill is: "+bill);
    }
}
