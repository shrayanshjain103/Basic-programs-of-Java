package com.shrayansh;

import java.util.Scanner;

public class VolumeOftriangularPrism {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the Apothem length of a triangular prism: ");
         float a=in.nextFloat();
        System.out.print("Base length of a triangular prism: ");
         float b=in.nextFloat();
        System.out.print(" height of a triangular prism: ");
         float h=in.nextFloat();
        float volume=(float)((a*b*h)/2);
        System.out.print("volume of a triangular prism: "+volume);
    }
}
