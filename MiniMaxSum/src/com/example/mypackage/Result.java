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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        if (arr.size() != 5)
            return;

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long sum = 0L;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 1 || arr.get(i) > Math.pow(10, 9))
                return;

            if (arr.get(i) < min)
                min = arr.get(i);
            if (arr.get(i) > max)
                max = arr.get(i);
            sum += arr.get(i);
        }
        System.out.printf("%d %d", sum - max, sum - min);

    }

}
