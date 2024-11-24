package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        int result1 = Array.binarySearch(arr, 4);
        int result2 = Array.binarySearch(arr, 122);

        System.out.println(result1);
        System.out.println(result2);

        result1 = Collections.binarySearch(lst, 4);
        result2 = Collections.binarySearch(lst, 122);

        System.out.println(result1);
        System.out.println(result2);

    }
}