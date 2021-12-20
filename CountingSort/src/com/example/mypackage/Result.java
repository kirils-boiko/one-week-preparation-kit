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
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> freqArr = Arrays.asList(new Integer[100]);
        Collections.fill(freqArr, 0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0 || arr.get(i) > 99)
                return null;
            freqArr.set(arr.get(i), freqArr.get(arr.get(i)) + 1);
        }
        return freqArr;
    }

}

