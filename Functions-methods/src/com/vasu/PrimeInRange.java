package com.vasu;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        isprime();
    }
    static void isprime(){
        int x = 2;
        int flag=0;
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        for (int i = a; i <= b; i++) {
            while (x * x < i){
                if (i%x == 0){
                    flag = 0;
                    break;
                }
                else{
                    flag = 1;
                }
                x++;
            }
        }
    }
}
