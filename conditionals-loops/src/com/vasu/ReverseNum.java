package com.vasu;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int newnum = 0;
        int rem = 0;
        while (num > 0){
            rem = num % 10;
            newnum = newnum * 10 + rem;
            num = num / 10;
        }
        System.out.println(newnum);
    }
}