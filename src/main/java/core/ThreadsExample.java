package core;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by golagem on 10/4/17.
 */
public class ThreadsExample {

    public static void main(String... s) throws InterruptedException {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread1());
        t1.start();
        t2.setPriority(10);
        t2.start();
        List<Integer> integers=new ArrayList<>();
        integers.add(2);


        System.out.println("aB".hashCode());
        System.out.println("`a".hashCode());
    }
}

class Thread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("started:" + Thread.currentThread().getName());
        Thread.yield();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ue) {
            }
        }

        System.out.println("completed:" + Thread.currentThread().getName());
    }


}


class Thread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("started:" + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ue) {

            }

        }
        System.out.println("completed:" + Thread.currentThread().getName());
    }
}
