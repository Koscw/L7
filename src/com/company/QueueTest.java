package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> strings = new PriorityQueue<>();
        strings.add(1);
        strings.add(3);
        strings.add(2);
        System.out.println(strings.toString());
        strings.offer(5);
        System.out.println(strings.toString());
    }
}
