package com.mallu.threads.yodlee;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by golagem on 11/19/17.
 */
public class LogDemo {
    private static BlockingQueue queue = new LinkedBlockingDeque<>();

    public static void main(String[] args) {
        Task t1 = new Task(new File("/Users/golagem/github/html-parsing/src/main/java/com/mallu/threads/yodlee/f1.txt"), queue);
        Task t2 = new Task(new File("/Users/golagem/github/html-parsing/src/main/java/com/mallu/threads/yodlee/f1.txt"), queue);
        Task t3 = new Task(new File("/Users/golagem/github/html-parsing/src/main/java/com/mallu/threads/yodlee/f1.txt"), queue);

        List<Callable> tasks = new ArrayList<>();
        tasks.add(t1);
        tasks.add(t2);
        tasks.add(t3);

    }
}
