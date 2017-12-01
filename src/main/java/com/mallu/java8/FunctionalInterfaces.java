package com.mallu.java8;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        print((s) -> {
            System.out.println(s);
        });
    }

    static void print(FuncInt f) {
        System.out.println(f.say());
        f.test("Done");
    }
}

@FunctionalInterface
interface FuncInt {
    void test(String s);

    default String say() {
        return "say";
    }
}

@FunctionalInterface
interface FuncInt1 {
    void test1();
}

