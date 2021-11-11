package com.shrayansh;

import java.util.Scanner;

public class dollar {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("enter the amount in rupees: ");
        float amount1=in.nextFloat();
        System.out.print("enter the latest rate of dollar in rupees: ");
        float amount2= in.nextFloat();
        if(amount2>0){
            float a=(amount2*amount1);
            System.out.print("the amount in dollar is: "+a);

        }
    }
}
