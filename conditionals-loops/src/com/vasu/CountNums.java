package com.vasu;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        int count = 0;
        int num = 55532255;
        while (num >0){
            int rem = num % 10;
            if (rem == 5){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}