package com.mallu.coompanies.syncron;

/**
 * Created by golagem on 12/1/17.
 */
public class ABOperation {

    public static void main(String[] args) {

        System.out.println(isPossible(1, 4, 24, 19));
    }


    public static String isPossible(int a, int b, int c, int d) {

        int l = a, m = b;
        while (l <= c && m <= d) {
            if (l == c && m == d) {
                return "YES";
            } else if (l == c) {
                m = l + m;
            } else if (m == d) {
                l = l + m;
            }
            else m = l + m;
        }

        while (a <= c && b <= d) {

            if (a == c && b == d) {
                return "YES";
            } else if (a == c) {
                b = a + b; //
            } else if (b == d) {
                a = a + b; //
            }  // 5, 4

            else {
                a = a + b;
            }
        }

        return "NO";
    }
}
