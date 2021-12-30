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
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        if (n.length() == 1 && k == 1)
            return Integer.parseInt(n);
        else if (n.length() == 1) {
            int digit = Integer.parseInt(n) * k;
            return superDigit(Integer.toString(digit), 1);
        } else {
            int superDigit = 0;
            for (int i = 0; i < n.length(); i++) {
                superDigit += (n.charAt(i) - 48);
            }
            return superDigit(Integer.toString(superDigit), k);
        }
    }

}


