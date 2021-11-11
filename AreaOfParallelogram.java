package com.shrayansh;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the height of Parallelogram triangle: ");
        float h=in.nextFloat();
        System.out.print("enter the base of Parallelogram triangle: ");
        float b=in.nextFloat();
        float A=b*h;
        System.out.print("Area of Parallelogram is: "+A);
    }
}
