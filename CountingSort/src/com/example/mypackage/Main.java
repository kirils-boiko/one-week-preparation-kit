package com.example.mypackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(new Integer[10]);
        Collections.fill(arr, 0);
        Integer element = arr.get(4);
        element = 10;
        System.out.println(arr.get(4));
    }
}
