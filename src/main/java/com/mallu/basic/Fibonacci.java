package com.mallu.basic;

/**
 * Created by golagem on 10/11/17.
 */
public class Fibonacci {
    public static void main(String... s) {
        int n = 7;
        int[] a = fibonacci(n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static int[] fibonacci(int n) {
        int[] a = new int[n];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i < n; i++) {
            int fib = a[i - 1] + a[i - 2];
            a[i] = fib;
        }
        return a;
    }

    private static int fibonacciRecursive(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}

/*
n=5
4
3
2
1




 */
