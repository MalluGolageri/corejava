package com.mallu.Strings;

import java.io.IOException;
import java.sql.Timestamp;

/**
 * Created by golagem on 11/9/17.
 */
public class Anagram {

    public static void main(String[] args) {

//        String s1="ask";
//        String s2="ksb";
//        if(s1.length() !=s2.length()) System.out.println("NO");
//        for (char c:s1.toCharArray()){
//            if(!s2.contains(c+"")){
//                System.out.println("NO");
//                return;
//            }
//        }

        System.out.println("YES");

        int x[][]=new int[3][];
        for ( int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }

        try{
            throw new IOException();
        }catch (Exception e){
            System.out.println("ioex");
        }finally {
            System.out.println("finally");
        }
    }

}
