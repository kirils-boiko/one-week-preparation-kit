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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        int hh = Integer.parseInt(s.substring(0, 2));
        if (s.substring(8).equals("AM")) {
            if (hh == 12)
                hh = 0;
        }
        else if (s.substring(8).equals("PM")) {
            if (hh != 12)
                hh += 12;
        }
        else
            return "INVALID TIME FORMAT";

        int mm = Integer.parseInt(s.substring(3,5));
        int ss = Integer.parseInt(s.substring(6,8));

        if (hh > 24 || hh < 0 || mm > 60 || mm < 0 || ss > 60 || ss < 0)
            return "INVALID TIME FORMAT";

        String result = String.format("%02d:%02d:%02d", hh, mm, ss);
        return result;
    }

}