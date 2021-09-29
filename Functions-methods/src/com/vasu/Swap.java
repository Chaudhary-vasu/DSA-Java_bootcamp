package com.vasu;

public class Swap {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        Swapping(a,b);
    }
    static void Swapping(int a,int b){
//        int a = 10;
//        int b = 20;

        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
