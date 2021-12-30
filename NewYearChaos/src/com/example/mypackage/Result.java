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
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        int totalBribes = 0;

        int expectedFirst = 1;
        int expectedSecond = 2;
        int expectedThird = 3;

        for (int i = 0; i < q.size(); i++) {
            if (q.get(i) == expectedFirst) {
                expectedFirst = expectedSecond;
                expectedSecond = expectedThird;
                expectedThird++;
            } else if (q.get(i) == expectedSecond) {
                expectedSecond = expectedThird;
                expectedThird++;
                totalBribes++;
            } else if (q.get(i) == expectedThird) {
                expectedThird++;
                totalBribes+=2;
            } else {
                System.out.println("Too chaotic");
                return;
            }
        }
        System.out.println(totalBribes);
    }
}