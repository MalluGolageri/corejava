package com.mallu.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by golagem on "1"1/24/"17.
 */
public class TestHashMapOrder {


    public static void main(String[] args) {
        testMapOrder();
    }

    static void testMapOrder() {
        Map<String, String> map = new HashMap<>();
        map.put("11", "eleven");
        map.put("12", "twelve");
        map.put("13", "thirteen");
        map.put("14", "fourteen");
        map.put("15", "fifteen");
        map.put("16", "sixteen");
        map.put("17", "seventeen");
        map.put("18", "eighteen");
        map.put("19", "nineteen");
        map.put("20", "twenty");
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
        map.put("6", "six");
        map.put("7", "seven");
        map.put("8", "eight");
        map.put("9", "nine");
        map.put("10", "ten");

        map.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + ", " + entry.getValue()+ " ,hashCode:"+entry.getKey().hashCode());
        });

    }
}