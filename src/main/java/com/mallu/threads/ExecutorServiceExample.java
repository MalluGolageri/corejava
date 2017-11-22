package com.mallu.threads;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.*;
import java.util.concurrent.*;

/**
 * Created by golagem on 10/4/17.
 */
public class ExecutorServiceExample {
    public static void main(String... s) throws ExecutionException, InterruptedException{
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Executors.newFixedThreadPool(2);

        Executors.newCachedThreadPool();
        Runnable task = () -> {
            System.out.println("Runnable Task");
        };

        Callable<String> c1=() -> {
            for (int i=1;i<=10;i++){
                //Thread.sleep(200);
                System.out.println("c1:"+i);
            }
            return "success";
        };
        Callable<String> c2=() -> {
            for (int i=1;i<=10;i++){
               // Thread.sleep(200);
                System.out.println("c2:"+i);
            }
            return "success";
        };
        Callable<String> c3=() -> {
            for (int i=1;i<=10;i++){
               // Thread.sleep(200);
                System.out.println("c3:"+i);
            }
            return "success";
        };

        Set<Callable<String>> callables=new HashSet<>();
        callables.add(c1);
        callables.add(c2);
        callables.add(c3);

        System.out.println("start---");
        long start=System.currentTimeMillis();
        List<Future<String>> futures=executorService.invokeAll(callables);
        for(Future<String> future : futures){
            System.out.println("future.get = " + future.get());
        }
        long end=System.currentTimeMillis();
        System.out.println("end---");

        System.out.println("Time Taken:"+(end-start)+" millis");
        //Callable callableTask=

//        executorService.execute(task);
//
//        executorService.submit(() -> {
//            return "callable task";
//        });
//
//        Future future=executorService.submit(() -> {
//            return "callable task";
//        });
//
//        System.out.println(future.get());

        executorService.shutdown();
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