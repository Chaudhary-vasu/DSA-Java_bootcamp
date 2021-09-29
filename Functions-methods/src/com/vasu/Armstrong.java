package com.vasu;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }
   static boolean isArmstrong(int num){
        int original = num;
        int sum = 0;
        while (num > 0){
            int rem = num % 10;
            num = num/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
   }
}
