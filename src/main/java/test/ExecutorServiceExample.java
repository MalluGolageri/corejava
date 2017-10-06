package test;

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

        Future future=executorService.submit(() -> {
            return "callable task";
        });

        System.out.println("KING".hashCode() + " \n"+"BLAKE".hashCode());
       // System.out.println(future.get());;

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
        return "callable task";
    }
}