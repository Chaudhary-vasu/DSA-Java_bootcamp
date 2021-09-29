package com.vasu;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num){
        int a = 2;
        if (num <= 1){
            return false;
        }
        while (a * a <= num){
        if (num % a == 0){
            return false;
        }
        a++;
        }
        return a * a > num;
    }
}
