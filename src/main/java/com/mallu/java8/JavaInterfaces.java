package com.mallu.java8;

/**
 * Created by golagem on 11/25/17.
 */



interface InterfaceOne{

    default void test(){
        System.out.println("default test method");
    }
    static void testOne(){
        System.out.println("static testOne method");
    }
}


public class JavaInterfaces implements InterfaceOne{

    public static void main(String[] args) {
        new JavaInterfaces().test1();
        InterfaceOne.testOne();
    }

    public void test1(){
        test();
    }

}
