package com.shrayansh;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the side of cube:" );
        float a=in.nextFloat();
        float TSA=(float) (6*a*a);
        System.out.print("Total Surface Area Of Cube: "+TSA);
    }
}
