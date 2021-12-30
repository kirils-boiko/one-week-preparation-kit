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
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    private static class Tracker {
        private int index = 0;

        public int getIndex() {
            return index;
        }

        public void increment() {
            index++;
        }
    }

    public static String isBalanced(String s) {
        Tracker i = new Tracker();
        boolean balanced = true;
        while (i.getIndex() < s.length() && balanced) {
            balanced = recursion(i, s);
            i.increment();
        }

        if (balanced)
            return "YES";
        else
            return "NO";


    }

    private static boolean recursion(Tracker i, String s) {
        if (i.getIndex() >= s.length() - 1)
            return false;
        char bracket = s.charAt(i.getIndex());
        char matchingClosingBracket = 'n';
        if (bracket == '(')
            matchingClosingBracket = ')';
        else if (bracket == '[')
            matchingClosingBracket = ']';
        else if (bracket == '{')
            matchingClosingBracket = '}';

        while (i.getIndex() < s.length() - 1) {
            i.increment();
            if (s.charAt(i.getIndex()) == matchingClosingBracket) {
                return true;
            } else if (s.charAt(i.getIndex()) == '(' ||
                    s.charAt(i.getIndex()) == '[' ||
                    s.charAt(i.getIndex()) == '{') {
                  if (recursion(i, s))
                      continue;
                  else
                      return false;
            } else {
                return false;
            }
        }
        return false;
    }

}
