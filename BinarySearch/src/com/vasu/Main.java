package com.vasu;

public class Main {

    public static void main(String[] args) {
	int[] arr = {-16,-12,-8,-4,0,2,5,7,9,23,45,67,98}; // for ascending order sorted array
	int target = 45;
	int ans =  binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr,int target){
    int start = 0;
    int end = arr.length - 1;
         while (start <= end){
             int mid = start + (end-start) / 2;
             if (target < arr[mid]){
                 end = mid - 1;
             }
             else if (target > arr[mid]){
                 start = mid + 1;
             }
             else{
                 return mid;
             }
         }
         return -1;
    }
}
