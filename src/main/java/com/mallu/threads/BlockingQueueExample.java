package com.mallu.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by golagem on 10/5/17.
 */
public class BlockingQueueExample {

    public static void main(String... s) throws InterruptedException{
        BlockingQueue<String> bQueue = new ArrayBlockingQueue<String>(10);
        bQueue.add("ArrayBlockingQueue");

        BlockingQueue<String> strings=new LinkedBlockingDeque<>(2);
        strings.add("LinkedBlockingDeque");

        Lock lock=new Lock();
        lock.setIsLocked(true);
        lock.lock();
        strings.forEach(System.out::print);
        lock.unlock();
    }

}
 class Lock{

    private boolean isLocked = true;

    public synchronized void lock()
            throws InterruptedException{
        while(isLocked()){
            wait();
        }
        setIsLocked(true);
    }

    public synchronized void unlock(){
        setIsLocked(false);
        notify();
    }

     public boolean isLocked() {
         return isLocked;
     }

     public void setIsLocked(boolean isLocked) {
         this.isLocked = isLocked;
     }
 }
