package com.vasu;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(fact(num));
    }
    static int fact(int num){
        int f = 1 ;
        while (num > 0){
            f = num * f;
            num--;
        }
        return f;
    }
}
