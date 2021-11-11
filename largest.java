package com.shrayansh;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter two numbers: ");
        int n1=in.nextInt();
        int n2=in.nextInt();

        //first logic

        if(n1>n2){
            System.out.println("largest number is: "+n1);
        } else{
            System.out.println("largest number is: "+n2);
        }


         /* second logic
        system.out.println(Math.max(n1,n2));
        */


    }
}
