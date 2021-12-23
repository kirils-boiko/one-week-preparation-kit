package com.example.mypackage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            Integer n = Integer.parseInt(br.readLine().trim());

            List<Long> arr = new ArrayList<>();

            arr = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Long::parseLong).collect(toList());

            Result.findZigZagSequence(arr);

            for (int i = 0; i < arr.size(); i++) {
                System.out.print(arr.get(i));
                if (i < arr.size() - 1)
                    System.out.print(" ");
            }

            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
