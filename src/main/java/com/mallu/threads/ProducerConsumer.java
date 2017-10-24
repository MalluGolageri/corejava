package com.mallu.threads;

import java.util.*;

/**
 * Created by golagem on 10/22/17.
 */
public class ProducerConsumer {

    public static Queue queue = new LinkedList<>();
    static int maxSize = 10;

    public static void main(String[] args) {
        Producer producer = new Producer(queue, maxSize);
        Consumer consumer = new Consumer(queue, maxSize);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}


class Consumer implements Runnable {
    public Queue queue = null;
    int maxSize;

    public Consumer(Queue product, int maxSize) {
        this.queue = product;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    try {
                        System.out.println("consumer waiting...");
                        queue.wait();
                    } catch (InterruptedException ie) {
                    }
                }
                Object o = queue.remove();
                System.out.println("Consumed:" + o);
                queue.notify();
            }//sync
        }
    }
}

class Producer implements Runnable {
    public Queue queue = null;
    int maxSize;

    public Producer(Queue product, int maxSize) {
        this.queue = product;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.size() == maxSize) {
                    try {
                        System.out.println("producer waiting...");
                        queue.wait();
                    } catch (InterruptedException ie) {
                    }
                }
                Random random = new Random();
                int i = random.nextInt();
                queue.add(i);
                System.out.println("Produced:" + i);
                queue.notify();
            }//sync
        }
    }
}

