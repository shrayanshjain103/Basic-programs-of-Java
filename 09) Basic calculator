package com.shrayansh;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        System.out.print("enter two numbers: ");
        int n1=in.nextInt();
        int n2=in.nextInt();
        System.out.print("enter the operator: ");
        char ch=in.next().trim().charAt(0);
        int answer=0;
        while(true){
            if(ch=='+'||ch=='-'||ch=='*'||ch=='%'||ch=='/'){
                if(ch=='+'){
                    answer=n1+n2;
                    System.out.println(answer);
                }
                if(ch=='-'){
                    answer=n1-n2;
                    System.out.println(answer);
                }
                if (ch=='*'){
                    answer=n1*n2;
                    System.out.println(answer);
                }
                if(ch=='%'){
                    if(n2>0){
                        answer=n1%n2;
                        System.out.println(answer);
                    }
                }
                if(ch=='/'){
                    if(n2>0){
                        answer=n1/n2;
                        System.out.println(answer);
                    }
                }
            }else{
                System.out.println("invalid operation !!");
            }
            break;

        }
    }
}
