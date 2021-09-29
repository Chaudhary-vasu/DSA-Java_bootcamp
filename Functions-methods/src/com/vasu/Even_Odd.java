package com.vasu;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
            if (isEvenorOdd(num)) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
    }
    static boolean isEvenorOdd(int num){
        return num % 2 == 0;
    }
}
