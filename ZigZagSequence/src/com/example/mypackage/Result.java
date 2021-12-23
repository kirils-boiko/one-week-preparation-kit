package com.example.mypackage;

import java.util.Collections;
import java.util.List;

public class Result {

    public static final void findZigZagSequence(List<Long> arr) {
        if (arr.size() % 2 == 0)
            return;

        Collections.sort(arr);
        int mid = arr.size()/2;
        long temp = arr.get(mid);
        arr.set(mid, arr.get(arr.size()-1));
        arr.set(arr.size() - 1, temp);

        int start = mid + 1;
        int end = arr.size() - 2;
        while (start < end) {
            temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
        return;
    }
}
