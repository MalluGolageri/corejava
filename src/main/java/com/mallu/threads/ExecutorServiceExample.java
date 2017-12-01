package com.mallu.threads;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.*;
import java.util.concurrent.*;

/**
 * Created by golagem on 10/4/17.
 */
public class ExecutorServiceExample {
    public static void main(String... s) throws ExecutionException, InterruptedException {
        //ExecutorService executorService = Executors.newSingleThreadExecutor();//6074   2296

        ExecutorService executorService = Executors.newCachedThreadPool();//2056

        //ExecutorService executorService = Executors.newFixedThreadPool(3);//

        Runnable task = () -> {
            System.out.println("Runnable task");
        };


        Callable<String> c1 = () -> {
            for (int i = 1; i <= 10; i++) {
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.println("c1:" + i);
            }
            return "success";
        };

        Callable<String> c2 = () -> {
            for (int i = 1; i <= 10; i++) {
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.println("c2:" + i);
            }
            return "success";
        };
        Callable<String> c3 = () -> {
            for (int i = 1; i <= 10; i++) {
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.println("c3:" + i);
            }
            return "success";
        };

        Set<Callable<String>> callables = new HashSet<>();
        callables.add(c1);
        callables.add(c2);
        callables.add(c3);

        Future<String> f1=executorService.submit(c1);
        Future<String> f2=executorService.submit(c2);
        Future<String> f3=executorService.submit(c3);
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());

        System.out.println("DONE...................");



        System.out.println("start---");
        long start = System.currentTimeMillis();
//        List<Future<String>> futures = executorService.invokeAll(callables);
//
//        for (Future<String> future : futures) {
//            System.out.println("future.get = " + future.get());
//        }

        long end = System.currentTimeMillis();
        System.out.println("end---");

        System.out.println("Time Taken:" + (end - start) + " millis");

        executorService.shutdown();
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("hello");
    }
}

class CallableTask implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("");
        return "callable task";
    }
}