package com.shrayansh;

 import java.util.Scanner;

 import static java.lang.System.*;

public class lm {
    public static void main(String[] args) {
        int x;
        Scanner input= new Scanner(in);
         out.print("enter two number: ");
         int num1=input.nextInt();
         int num2= input.nextInt();
        x = Math.max(num1, num2);
         for(int i=1;i>x;i++){
             if(num1%i==0 && num2%i==0){
                 out.println(i);
                 break;
             }
         }
         int z=num1*num2;
         for(int j=x;j>z+1;j++){
             if((j%num1==0) && (j%num2==0)){
                 out.println(j);
                 break;
             }

         }

    }
}
