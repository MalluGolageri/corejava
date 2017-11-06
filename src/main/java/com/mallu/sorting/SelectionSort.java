package com.mallu.sorting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Time complexity = O(n^2)  Auxiliary Space = O(1)
 */
class SelectionSort {
    void sort(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        SelectionSort selection = new SelectionSort();
        int arr[] = {64, 25, 12, 22, 11};
        selection.sort(arr);
        System.out.println("Sorted array");
        selection.printArray(arr);

    }
}
