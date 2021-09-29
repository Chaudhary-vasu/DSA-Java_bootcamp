package com.vasu;

import java.util.Scanner;

public class Vote_Check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (eligible(age)){
            System.out.println("Eligible to vote.");
        }
        else{
            System.out.println("Not Eligible for voting.");
        }
    }
    static boolean eligible(int age){
        return age >= 18;
    }
}
