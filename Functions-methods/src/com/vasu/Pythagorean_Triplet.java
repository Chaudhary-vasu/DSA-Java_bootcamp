package com.vasu;

import java.util.Scanner;

public class Pythagorean_Triplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(isPythagoreanTriplet(a, b, c));
    }
    static boolean isPythagoreanTriplet(int a ,int b, int c){
        if (a*a + b*b == c*c){
            return true;
        }
        else if (b*b + c*c == a * a){
            return true;
        }
        else return a * a + c * c == b * b;
    }
}
