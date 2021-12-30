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
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int pairs(int k, List<Integer> arr) {
        Collections.sort(arr);
        if (arr.get(arr.size() - 1) - arr.get(0) < k) {
            return 0;
        }

        int n = 0;
        int jEnd = arr.size() - 1;
        for (int i = arr.size()-1; i > 0; i--) {
            for (int j = Math.min(jEnd,i - 1); j > -1 ; j--) {
                if (arr.get(i) - arr.get(j) == k) {
                    n++;
                } else if (arr.get(i) - arr.get(j) > k) {
                    break;
                }
            }
        }

        return n;

    }

}
