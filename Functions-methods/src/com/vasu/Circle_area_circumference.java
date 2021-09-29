package com.vasu;

import java.util.Scanner;

public class Circle_area_circumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        circle(radius);
    }
    static void circle(float radius){
        float area = (float)3.14 * radius * radius;
        double circumference = (double) 2 * 3.14 * radius;
        System.out.println("Area of circle is :" + area);
        System.out.println("Circumference of circle is :"+ circumference);
    }
}
