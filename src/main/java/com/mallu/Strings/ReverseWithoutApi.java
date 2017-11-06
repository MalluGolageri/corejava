package com.mallu.Strings;

public class ReverseWithoutApi {
    public static void main(String[] args) {
        String s = "abc";
        //1
        System.out.println(new StringBuilder(s).reverse().toString());
        //2
        char[] chars = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
