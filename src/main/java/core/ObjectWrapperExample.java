package core;

import javax.crypto.MacSpi;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by golagem on 11/24/17.
 */


class M {
    private String name = "m";
}

class N extends M {
    private String name = "n";

}

public class ObjectWrapperExample {
    static void test(Object o) {
        System.out.println("object");
    }

    static void test(String s) {
        System.out.println("string");
    }

    static void test1(M m) {
        System.out.println("m.test");
    }

    static void test1(N n) {
        System.out.println("n.test");
    }

    static void testNum(int a) {
        System.out.println("int:" + a);
    }

    static void testNum(short s) {
        System.out.println("short:" + s);
    }

    static void testNum(byte b) {
        System.out.println("byte:" + b);
    }

    static void testNum(long l) {
        System.out.println("long:" + l);
    }

    static void testNum(float f) {
        System.out.println("float:" + f);
    }

    static void testNum(double d) {
        System.out.println("double:" + d);
    }

    static void testNum(char c) {
        System.out.println("char:" + c);
    }

    public static void main(String[] args) {
        test(null);
        test1(null);
        testNum(2);
        testNum('c');
    }



}
