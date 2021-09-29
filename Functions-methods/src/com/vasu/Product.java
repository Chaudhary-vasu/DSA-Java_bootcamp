package com.vasu;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(prod(a,b));
    }
    static long prod(int a,int b){
        long l = (long) a * b;
        return l;
    }
}
