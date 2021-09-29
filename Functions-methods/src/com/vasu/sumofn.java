package com.vasu;

import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(sum(num));
    }
    static int sum(int n){
        int s = 0;
        while (n > 0){
            s = s + n;
            n--;
        }
        return s;
    }
}
