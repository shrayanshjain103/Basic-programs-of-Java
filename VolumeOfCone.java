package com.shrayansh;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the radius of cone:" );
        float r=in.nextFloat();
        System.out.print("enter the height of cone: ");
        float h=in.nextFloat();
        float Volume=(float) (Math.PI*r*r*(h/3));
        System.out.print("Volume Of Cone is: "+Volume);
    }
}
