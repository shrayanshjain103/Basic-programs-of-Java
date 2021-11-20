package com.shrayansh;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class permutationcombination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        System.out.print("Enter the value of r: ");
        int r = in.nextInt();
        int a = 1, b = 1, d=1,e=1,f=1;
         for (int i = 1; i <= n; i++) {
            a = a * i;
         }
            for (int j =1; j <=r; j++) {
                b = b * j;
            }
            int c=n-r;
        for (int k = 1; k <=c; k++) {
            d=d*k;
        }
        f=a/d;
        e=a/(b*d);
        System.out.println("Permutation is: "+f);
        System.out.println("Combination is: "+e);

    }
}
