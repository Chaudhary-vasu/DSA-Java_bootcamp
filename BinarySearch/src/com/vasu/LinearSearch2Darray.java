package com.vasu;

import java.util.Arrays;

public class LinearSearch2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {18,9,12},
                {36,-4,91},
                {44,33,16}
        };
        int target = 30;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                if (arr[r][c] == target)
                    return new int[]{r,c};
            }
        }
        return new int[]{-1,-1};
    }
}
