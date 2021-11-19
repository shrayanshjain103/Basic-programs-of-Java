package com.shrayansh;

import java.util.Scanner;

public class comission {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the sell amount: ");
        float comission=in.nextFloat();
        System.out.print("Enter the rate of comission: ");
        float rate=in.nextFloat();
        float amount=(float) ((comission*rate)/100);
        System.out.print("The comission is: "+amount);
    }
}
