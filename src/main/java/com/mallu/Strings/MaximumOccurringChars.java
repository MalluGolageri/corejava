package com.mallu.Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by golagem on 11/21/17.
 */
public class MaximumOccurringChars {

    public static void main(String[] args) {


        String s = "zaper media labs";

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String key = s.charAt(i) + "";
            if (map.containsKey(key))
                map.put(key, map.get(key) + 1);
            else
                map.put(s.charAt(i) + "", 1);
        }
        map.forEach((k, v) -> {
            System.out.println(k+" "+v);
        });

        System.out.println(map.entrySet().stream().max((o1, o2) -> (
                o1.getValue() - o2.getValue())).get().getValue()
        );
    }


    public static void test(Object o){
        System.out.println("object");
    }

    public static void test(String o){
        System.out.println("string");
    }

    public static void test(Integer integer){
        System.out.println("integer");
    }


}
