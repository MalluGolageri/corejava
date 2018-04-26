package com.mallu.recursion;

/**
 * Created by golagem on 11/13/17.
 */
public class Sum {

    public static void main(String[] args) {
        System.out.println(getMultiplied(3, 4));
    }

    private static int getMultiplied(int a, int b) {
        return (b == 1 || a == 1) ? a : a + getMultiplied(a, b - 1);
    }

}
