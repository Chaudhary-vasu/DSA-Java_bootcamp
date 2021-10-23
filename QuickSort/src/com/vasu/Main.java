package com.vasu;

import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        quick(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    static void quick(int[] a,int p,int r){
        int q;
        if (p<r){
            q = partition(a,p,r);
            quick(a,p,q-1);
            quick(a,q+1,r);
        }
    }
    static int partition(int[] a,int p,int r) {
        int x = a[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (a[j] < x) {
                i = i + 1;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[r];
        a[r] = a[i+1];
        a[i+1] = temp;
        return i+1;
    }
}
