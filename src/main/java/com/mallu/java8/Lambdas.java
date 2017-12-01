package com.mallu.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * Created by golagem on 11/2/17.
 */
public class Lambdas {
    private static Map<Integer, Product> map = new HashMap<>();

    static {
        map.put(1, new Product(1, "MotoG"));
        map.put(2, new Product(1, "MotoG1"));
        map.put(3, new Product(1, "MotoG2"));
    }

    public static void main(String[] args) {
        System.out.println(map.entrySet().stream().filter(p -> p.getValue().name
                .equals("MotoG")).findFirst().get().getValue().name);

        Callable c = () -> "hi";
        Runnable r= ()-> {};
    }
}


class Product {

    public Product() {

    }

    public Product(int id, String name) {
        this.name = name;
        this.id = id;
    }

    int id;
    String name;
}