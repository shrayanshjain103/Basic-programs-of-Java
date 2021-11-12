package com.shrayansh;
import java.util.Scanner;

public class parameterofcircle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the radius of circle: ");
        float r=in.nextFloat();
        float Parameter=(float) (Math.PI*2*r);
        System.out.print("the parameter of circle is: "+Parameter);
    }
}
