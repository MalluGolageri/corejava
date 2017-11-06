package com.mallu.sorting;

/**
 * Time Complexity = O(n^2) Auxiliary Space = O(1)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a={4,3,6,7,2,1};
        sort(a);
        printArray(a);
    }

    private static void sort(int[] a) {
        int len=a.length;
        for (int i=0;i<len-1;i++){
            for (int j=0;j<len-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
