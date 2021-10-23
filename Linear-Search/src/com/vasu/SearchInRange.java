package com.vasu;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = -3;
        int ans = searchrange(nums,target,1,4);
        System.out.println(ans);
    }
    static int searchrange(int[] arr,int target,int start,int end){
        if (arr.length == 0)
            return -1;
        for (int index = start; index < end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
