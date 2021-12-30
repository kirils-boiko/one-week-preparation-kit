package com.example.mypackage;

import java.io.*;
import java.util.*;

public class Solution {

    static class LinkedListNode {
        long data;
        LinkedListNode next;

        public LinkedListNode(long data) {
            this.data = data;
            this.next = null;
        }
    }

    static class CustomQueue {
        LinkedListNode front = null;
        LinkedListNode end = null;

        public void enqueue(long x) {
            if (end != null) {
                LinkedListNode temp = new LinkedListNode(x);
                end.next = temp;
                end = end.next;
            } else {
                end = new LinkedListNode(x);
                front = end;
            }
        }

        public void dequeue() {
            if (front == null) {
               return;
            } else {
                if (front == end) {
                    front = end = null;
                } else {
                    front = front.next;
                }
            }
        }

        public void printFront() {
            if (front != null) {
                System.out.println(front.data);
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        CustomQueue queue = new CustomQueue();

        int queries = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int query = 0; query < queries; query++) {
            int type = scanner.nextInt();
            if (type == 1) {
                long x = scanner.nextLong();
                queue.enqueue(x);
            } else if (type == 2) {
                queue.dequeue();
            } else if (type == 3) {
                queue.printFront();
            }
        }
    }
}