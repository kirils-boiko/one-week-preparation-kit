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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        if (s.length() < 1 || s.length() > 100 ||
                k < 0 || k > 100)
            return null;
        char[] message = s.toCharArray();
        for (int i = 0; i < message.length; i++) {
            if (Character.isLowerCase(message[i])) {
                int oldChar = message[i] - 'a';
                int newChar = 'a' + ((oldChar + k) % 26);
                message[i] = (char) newChar;
            } else if (Character.isUpperCase(message[i])) {
                int oldChar = message[i] - 'A';
                int newChar = 'A' + ((oldChar + k) % 26);
                message[i] = (char) newChar;
            }
        }

        String result = new String(message);
        return result;
    }

}
