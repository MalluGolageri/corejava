package com.mallu.patterns;

/**
 * Created by golagem on 10/11/17.
 */
public class Rhombus {

    public static void main(String... s) {
        int n = 17;
        int second = n - 1;
        char charValue = '*';
        int centrePoint = n % 2 == 0 ? n / 2 : ((n / 2) + 1);
        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                if (j > (i + 1)) {
                    System.out.print(" ");
                    continue;
                }
                if (i == n - 1 && j == centrePoint)
                    System.out.print(" c" );
                else {
                    System.out.print(" " + charValue);
                }
            }
            System.out.println();
        }

        //second=4
        for (int i = second, k = 0; i > 0; i--, k++) {

            for (int j = 0; j < second; j++) {
                if (j <= k) {
                    System.out.print(" ");
                }
            }

            for (int j = 0; j < second; j++) {
                if (i > j) {
                    System.out.print(" " + charValue);
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
