package com.vasu;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        System.out.println("Enter the 3 numbers");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
//        int max = Math.max(c,Math.max(b,a));
        System.out.println(max);
    }
}
