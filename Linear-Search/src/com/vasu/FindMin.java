package com.vasu;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        if (arr.length == 0)
            System.out.println("Array length is not enough!");
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}