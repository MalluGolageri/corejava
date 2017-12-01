package com.mallu.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by golagem on 12/1/17.
 */
public class Synhronization {

    public static void main(String[] args){
        Synhronization sync=new Synhronization();
        ExecutorService es= Executors.newCachedThreadPool();


        System.out.println("aB".hashCode() +" "+"`a".hashCode());
        Runnable sync1=()-> {
            try {
                sync.test();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable sync2=()-> {
            try {
                sync.test();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        es.submit(sync1);
        es.submit(sync2);
    }

    public synchronized void test() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.println(Thread.currentThread().getName() +":"+i);
        }
    }

    public void test1() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }


}

class SyncExample implements Runnable {
    Synhronization sync=new Synhronization();
    @Override
    public void run() {
        try {
            sync.test();
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }

    }
}

class SyncExample2 implements Runnable {
    Synhronization sync=new Synhronization();
    @Override
    public void run() {
        try {
            sync.test();
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }

    }
}