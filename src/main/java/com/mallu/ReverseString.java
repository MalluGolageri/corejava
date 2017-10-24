package com.mallu;

import java.util.HashMap;

/**
 * Created by golagem on 10/18/17.
 */
public class ReverseString {

    public static void main(String[] args) {
        String s="cheras";
        char[] chars=s.toCharArray();
        for (int i=0,j=chars.length-1; i<j;i++,j--){
            char c=chars[i];
            char c1=chars[j];
            chars[i]=c1;
            chars[j]=c;
        }

        System.out.println(chars);
    }


}
