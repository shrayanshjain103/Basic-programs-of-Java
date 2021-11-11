package com.shrayansh;

import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the radius of circle: ");
        float r=in.nextFloat();
        float area= (float) (Math.PI*(r*r));
        System.out.print("Area of circle is: "+area);

    }
}
