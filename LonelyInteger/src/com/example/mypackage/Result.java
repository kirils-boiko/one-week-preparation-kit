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
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        if (a.size() < 1 || a.size() > 100 || a.size() % 2 == 0)
            return -1;
        Collections.sort(a);
        for (int i = 0; i < a.size() - 1; i += 2) {
            if (a.get(i) < 0 || a.get(i) > 100 || a.get(i+1) < 0 ||
                a.get(i+1) > 100)
                return -1;
            if (a.get(i) != a.get(i+1))
                return a.get(i);
        }

        if (a.get(a.size() - 1) < 0 || a.get(a.size() - 1) > 100)
            return -1;
        else
            return a.get(a.size()-1);

    }

}