package com.mallu.patterns;

import java.util.Scanner;

/**
 * Created by golagem on 10/10/17.
 */
public class Zshape {
	public static void main(String... s) {
		int[][] a = { { 1, 2, 3, 4, 7, 7, 8 }, { 4, 5, 6, 6, 6, 9, 9 }, { 7, 8, 8, 8, 9, 6, 5 },
				{ 1, 2, 4, 3, 5, 1, 4 }, { 1, 2, 9, 4, 7, 3, 0 }, { 1, 2, 9, 4, 3, 5, 0 }, { 1, 2, 9, 4, 3, 5, 0 } };
		// int m = new Scanner(System.in).nextInt();
		// int n = new Scanner(System.in).nextInt();
		// int[][] a = new int[m][n];
		// System.out.println("enter entries");
		// for (int i = 0; i < m; i++) {
		// for (int j = 0; j < n; j++) {
		// a[i][j] = new Scanner(System.in).nextInt();
		// }
		// }

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == 0 || i == a.length - 1) {
					System.out.print(" " + a[i][j]);
				} else if ((i + j) != (a.length - 1)) {
					System.out.print("  ");
				} else {
					System.out.print(" " + a[i][j]);
				}
			}
			System.out.println();
		}
	}
}
