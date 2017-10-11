package com.mallu.Strings;

/**
 * Created by golagem on 10/11/17.
 */
public class RecursiveReverse {

    static String rev = "";

    public static void main(String... s) {

        String st = "abcdefgh";
        System.out.println(reverse(st));
    }

    private static String reverse(String s) {
        if (s == null) return null;
        if (s.length() == 1) {
            rev += s.charAt(s.length() - 1);
        } else {
            rev += (s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1)));
        }
        return rev;
    }
}
