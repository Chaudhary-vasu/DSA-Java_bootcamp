package com.vasu;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr= {9,6,5,0,8,2,7,1};
        insertion(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] insertion(int[] arr,int n){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }
}
