package com.shrayansh;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the radius of Cylinder: ");
        float r=in.nextFloat();
        System.out.print("enter the height of Cylinder: ");
        float h=in.nextFloat();
        float volume=(float) (Math.PI*r*r*h);
        System.out.print("Volume Of Cylinder: "+volume);
    }
}
