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
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int palindromeIndex(String s) {
        if (s.length() < 1 || s.length() > Math.pow(10,5) + 5) {
            return -1;      // invalid input -> no solution
        }

        if (s.length() == 1)
            return -1;      // single-letter is not palindrome

        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                String temp = s.substring(0, start) +
                        s.substring(start + 1);
                String rev = new StringBuffer(temp).reverse().toString();
                if (temp.equals(rev))
                    return start;
                temp = (end != s.length() -1) ?
                        s.substring(0, end) + s.substring(end + 1) :
                        s.substring(0, end);
                rev = new StringBuffer(temp).reverse().toString();
                if (temp.equals(rev))
                    return end;
                return -1;
            }
            start++;
            end--;
        }
        return -1;

//        for (int i = 0; i < s.length(); i++) {
//            String temp;
//            if (i < s.length() - 1)
//                temp = s.substring(0, i) + s.substring(i + 1, s.length());
//            else
//                temp = s.substring(0, i);
//            rev = new StringBuffer(temp).reverse().toString();
//            if (temp.equals(rev))
//                return i;
//        }
//        return -1;
    }
}