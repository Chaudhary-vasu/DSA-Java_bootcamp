package com.vasu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.println("Enter the operator :");
            char op = input.next().trim().charAt(0);
            if (op == '+' ||op == '-' ||op == '*' ||op == '/' ||op == '%'){
                System.out.println("Enter the numbers :");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.println();
                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                    ans = num1 / num2;
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
            }
            else if (op == 'X' || op =='x'){
                break;
            }
            else{
                System.out.println("Invalid operator!!");
            }
            System.out.println(ans);
        }
    }
}