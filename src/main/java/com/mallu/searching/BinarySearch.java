package com.mallu.searching;

/**
 * T(n)=O(log n)
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 3465, 46767};
        int x = binarySearch(arr, 0, arr.length - 1, 9);
        System.out.println(x);
    }

    private static int binarySearch(int[] arr, int left, int right, int num) {
        if (right >= left) {
            int mid = (left + (right - 1)) / 2;
            if (arr[mid] == num) {
                return arr[mid];
            } else if (arr[mid] > num) {
                return binarySearch(arr, left, mid - 1, num);
            } else {
                return binarySearch(arr, mid + 1, right, num);
            }
        } else {
            return -1;
        }
    }
}
