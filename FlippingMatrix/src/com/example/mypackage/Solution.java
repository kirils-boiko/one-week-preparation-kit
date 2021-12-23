package com.example.mypackage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;


public class Solution {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine().trim());

            List<List<Integer>> matrix = new ArrayList<>();

            IntStream.range(0, 2*n).forEach(i -> {
                try {
                    matrix.add(
                            Stream.of(br.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .collect(toList())
                    );
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            int result = Result.getMaxSum(n, matrix);

            bw.write(String.valueOf(result));
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
