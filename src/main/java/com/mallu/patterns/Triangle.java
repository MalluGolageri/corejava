package com.mallu.patterns;

/**
 * Created by golagem on 10/11/17.
 */
public class Triangle {

    public static void main(String... s) {

        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j=n;j>0;j--){
                if(j>(i+1)){
                    System.out.print(" ");
                    continue;
                }
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
