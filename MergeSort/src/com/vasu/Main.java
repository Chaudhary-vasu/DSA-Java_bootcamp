package com.vasu;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {12,43,6,45,7};
	    mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr,int p,int r){
        if (p<r){
            int q = (p+r)/2;
            mergesort(arr,p,q);
            mergesort(arr,q+1,r);
            merge(arr,0,q, arr.length-1);
        }
        return arr;
    }
    static int[] merge(int[] arr,int lb,int mid,int ub){
        int[] b = new int[ub];
        int i = lb;
        int j = mid + 1;
        int k = lb;
        while (i<mid && j<=ub){
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
            }
            else{
                b[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<mid)
        {
            arr[k] = b[i];
            i++;
            k++;
        }

        while (j<ub)
        {
            arr[k] = b[j];
            j++;
            k++;
        }
//        for (int l = lb; l < ub; l++) {
//            arr[l] = b[l];
//        }
        return arr;
    }
}
