package com.vasu;

public class FindMaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12,54,2,7,25},
                {1,221,32},
                {98,65,3,66}
        };
        int ans = max2d(arr);
        System.out.println(ans);

    }
    static int max2d(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
