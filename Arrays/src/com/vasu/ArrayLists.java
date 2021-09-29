package com.vasu;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(2);
//        list.add(35);
//        list.add(394);
//        list.add(945);
//        list.add(46635);
//        list.add(3556);
//        list.add(364);
//        System.out.println(list);
//                    OR
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            list.add(input.nextInt());
        }
        System.out.println(list);
    }
}
