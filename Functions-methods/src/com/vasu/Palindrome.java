package com.vasu;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num =  input.nextInt();
        System.out.println(isPalindrome(num));
    }
    static boolean isPalindrome(int num){
        int oldnum = num;
        int newnum = 0;
        while (num > 0){
            int rem = num % 10;
            newnum = (newnum * 10) + rem;
            num = num/10;
        }
        return newnum == oldnum;
    }
}
