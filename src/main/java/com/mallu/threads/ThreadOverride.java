package com.mallu.threads;
import java.util.*;

/**
 * Created by golagem on 11/9/17.
 */
public class ThreadOverride {

    public static void main(String[] args) {

        Test t1 = new Test(1);
        Test t2 = new Test(2);
        Map map = new HashMap<>();
        map.put(t1, 1);
        map.put(t2, 1);

        System.out.println(map.size());

        Set s = map.keySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        List list=new LinkedList<>();
        list.add("1");
        list.add("2");
        System.out.println(list.size());

        ArrayList arrayList=new ArrayList(20);
        arrayList.add("12");
        System.out.println(arrayList.size());

    }
}


class Example extends Thread implements Runnable {

    public Example() {
        System.out.println("example");
    }

    public static void main(String[] args) {
        Thread t = new big(new small());
        t.start();
    }
}

class big extends Thread {

    big(Runnable runnable) {
        super(runnable);
    }

    @Override
    public void run() {
        System.out.println("big");
    }
}

class small extends Thread {

    @Override
    public void run() {
        System.out.println("small");
    }
}

class Test {
    int id;
    Test(int id) {
        this.id = id;
    }
}

