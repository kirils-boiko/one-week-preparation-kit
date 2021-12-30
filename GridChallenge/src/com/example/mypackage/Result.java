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
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        boolean result = true;

        for (int i = 0; i < grid.size() && result; i++) {
            char[] row = grid.get(i).toCharArray();
            Arrays.sort(row);
            String sortedRow = new String(row);
            grid.set(i, sortedRow);
            if (i > 0 && result) {
                for (int j = 0; j < sortedRow.length(); j++) {
                    if (grid.get(i).charAt(j) < grid.get(i-1).charAt(j)) {
                        result = false;
                        break;
                    }
                }
            }
        }

        return (result) ? "YES" : "NO";
    }

}