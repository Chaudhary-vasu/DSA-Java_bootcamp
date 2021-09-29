package com.vasu;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = input.next();
    String message = greet(name);
        System.out.println(message);
    }
    static String greet(String name){
        String greeting = "hello " + name;
        return greeting;
    }
}
