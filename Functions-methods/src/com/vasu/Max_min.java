package com.vasu;

import java.util.Scanner;

public class Max_min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println("maximum among three numbers is :" + maximum(num1,num2,num3));
        System.out.println("minimum among three numbers is :" + minimum(num1,num2,num3));
    }
    static int maximum(int a,int b,int c){
        return Math.max(c,Math.max(a,b));
    }
    static int minimum(int a,int b,int c){
        return Math.min(c,Math.min(a,b));
    }
}
