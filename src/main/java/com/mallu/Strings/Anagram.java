package com.mallu.Strings;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Hashtable;

/**
 * Created by golagem on 11/9/17.
 */
public class Anagram {

    public static void main(String[] args) {
        String s1 = "ask";
        String s2 = "ksab";
        if (s1.length() != s2.length()) {System.out.println("NO");return;}
        for (char c : s1.toCharArray()) {
            if (!s2.contains(c + "")) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }





}
