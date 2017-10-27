package com.mallu.threads;

import java.util.HashMap;
import java.util.concurrent.*;

/**
 * Created by golagem on 10/4/17.
 */
public class ExecutorServiceExample {
    public static void main(String... s) throws ExecutionException, InterruptedException{
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Runnable task = () -> {
            System.out.println("Runnable Task");
        };

        //Callable callableTask=

        executorService.execute(task);

        executorService.submit(() -> {
            return "callable task";
        });

        Future future=executorService.submit(() -> {
            return "callable task";
        });

    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("hello");
    }
}

class CallableTask implements Callable{
    @Override
    public Object call() throws Exception {
        System.out.println("");
        return "callable task";
    }
}