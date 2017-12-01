package com.mallu.coompanies.syncron;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by golagem on 12/1/17.
 */
public class syncron {
    public static void main(String[] args) {
        int[] a = {1, 3, 46, 1, 3, 9};
        int b[] = {6, 6, 3, 9, 3, 5, 1, 2};
        getPairCount(b, 12);

    }

    public static int getPairCount(int[] a, long k) {
        int count = 0;
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] + a[j]) == k) {
                    if (s.add(a[i]) && ((a[j] == a[i]) || (s.add(a[j])))) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        return count;
    }


}
