package com.shrayansh;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the radius of circle:" );
        float r=in.nextFloat();
        System.out.print("enter the height: ");
        float h=in.nextFloat();
        float surfaceArea= (float) (2*Math.PI*r*h);
        System.out.print("Curved Surface Area Of Cylinder: "+surfaceArea);
    }
}
