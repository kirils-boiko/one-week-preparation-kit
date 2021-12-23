package com.example.mypackage;

import java.util.List;

public class Result {

    public static int getMaxSum(int n, List<List<Integer>> matrix) {
        if (n < 1 || n > 128)
            return -1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int upperLeft = matrix.get(i).get(j);
                int upperRight = matrix.get(i).get(matrix.size() - j - 1);
                int lowerLeft = matrix.get(matrix.size() - i - 1).get(j);
                int lowerRight = matrix.get(matrix.size() - i -1).get(matrix.size() - j -1);
                int min = Math.min(Math.min(upperLeft, upperRight), Math.min(lowerLeft, lowerRight));
                int max = Math.max(Math.max(upperLeft, upperRight), Math.max(lowerLeft, lowerRight));
                if (min < 0 || max > 4096)
                    return -2;
                sum += max;
            }
        }

        return sum;
    }
}
