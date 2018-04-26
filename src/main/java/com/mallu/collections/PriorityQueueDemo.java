package com.mallu.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        int queueSize = 2;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(queueSize);
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(10);
        list.add(5);
        list.add(9);
        list.add(9);
        list.add(23);
        list.add(9);
        list.add(12);
        Random random = new Random();
//        for (int j = 0; j < 10; j++) {
//        //    list.add(random.nextInt());
//        }
        for (int i = 0; i < list.size(); i++) {
            if (i < queueSize)
                priorityQueue.add(list.get(i));
            else {
                if (list.get(i) > priorityQueue.peek()) {
                   // priorityQueue.remove();
                    priorityQueue.add(list.get(i));
                }
            }
        }

        System.out.println("list" + list);
        System.out.println("priorityQueue" + priorityQueue);
        System.out.println(priorityQueue.peek());
    }
}
