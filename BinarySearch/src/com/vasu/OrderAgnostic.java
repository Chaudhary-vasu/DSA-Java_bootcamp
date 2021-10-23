package com.vasu;

import javax.naming.ldap.SortResponseControl;

public class OrderAgnostic {
    public static void main(String[] args) {
//        int[] arr = {56,45,32,22,18,4,0,-2,-5,-7,-9,-23,-45,-67,-98}; // for descending order sorted array
//        int target = -45;
        int[] arr = {-16,-12,-8,-4,0,2,5,7,9,23,45,67,98}; // for ascending order sorted array
        int target = 45;
        int ans = orderAgnosticBs(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBs(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end-start) / 2;
            if (arr[mid] == target)
                return mid;
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }
            else{
                if (target < arr[mid]){
                    start = mid + 1;
                }
                else if (target > arr[mid]){
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
