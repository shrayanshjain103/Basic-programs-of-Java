package com.shrayansh;

import java.util.Scanner;

public class areaofRhombus {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the first diagonal of Rhombus: ");
        float d1=in.nextFloat();
        System.out.print("enter the first diagonal of Rhombus: ");
        float d2=in.nextFloat();
        float area=(d1*d2)/2;
        System.out.print("Area of Rhombus: "+area);
    }
}
