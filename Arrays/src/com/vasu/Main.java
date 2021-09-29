package com.vasu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] arr = {1,2,3,4,5};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//                             OR
//        for (int a : arr){
//            System.out.print(a + " ");
//        }
//                             OR
//        System.out.println(Arrays.toString(arr));
//        int[] array = new int[5];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = input.nextInt();
//        }
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j]);
//        }
//        System.out.println(Arrays.toString(array));



        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.next();
        }
        System.out.println(Arrays.toString(arr));
//                                     OR
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//                                       OR
//        for (String a : arr){
//            System.out.print(a + " ");
//        }
        arr[0] = "vasu";
        System.out.println(Arrays.toString(arr));
    }
}
