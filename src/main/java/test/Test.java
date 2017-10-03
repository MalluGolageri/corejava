package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TimerTask;

/**
 * Created by golagem on 10/3/17.
 */
public class Test {
    public static void main(String... args){


        MyList<String> myList=new MyList<>();
        myList.add("Oye");myList.add("Hello1");myList.add("Hello2");myList.add("Hello3");myList.add("Hello4");


        System.out.println(myList.size);
        for (int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
        System.out.println("After");
        myList.remove(1);
        for (int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }

    }
}

class MyList<L> {

    int size;

    int initialCapacity=6;

    int totalCapacity=initialCapacity;

    transient Object[] objects=new Object[initialCapacity];

    void add(L obj){
        ensureCapacity(size +1);
        objects[size++]=obj;
    }

    public L get(int index) {
        return (L) objects[index];
    }

    public int size(){
        return objects.length;
    }

    public void ensureCapacity(int capacity){
        if(capacity >= totalCapacity){
            int newCapacity=totalCapacity+(initialCapacity>>1);
            totalCapacity=newCapacity;
            objects = Arrays.copyOf(objects,newCapacity);
        }
    }

    public L remove(int index){
        L oldValue = (L) objects[index];

        //20== 10 == 20-10-1=9th place removed
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(objects, index+1, objects, index,
                    numMoved);
        objects[--size] = null; // clear to let GC do its work

        return oldValue;
    }

}
