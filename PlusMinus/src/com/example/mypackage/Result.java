package com.example.mypackage;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        if (arr.size() < 1 || arr.size() > 100)
            return;

        double n = arr.size();
        double positive = 0.0;
        double negative = 0.0;
        double zeros = 0.0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < -100 || arr.get(i) > 100)
                return;
            if (arr.get(i) > 0)
                positive++;
            else if (arr.get(i) < 0)
                negative++;
            else
                zeros++;
        }

        System.out.printf("%.6f\n", positive/n);
        System.out.printf("%.6f\n", negative/n);
        System.out.printf("%.6f", zeros/n);

        Long.MAX_VALUE
    }

}
