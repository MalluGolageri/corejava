package com.mallu.files;

import java.io.File;

/**
 * Created by golagem on 11/9/17.
 */
public class FindFiles {

    public static void main(String[] args) {
        File f= new File("/Users/golagem/github/html-parsing/src/main/java/com/mallu");
        System.out.println(f.exists());


        System.out.println(f.isDirectory());
        for (String s:f.list()){

            System.out.println(s);
        }


    }
}
