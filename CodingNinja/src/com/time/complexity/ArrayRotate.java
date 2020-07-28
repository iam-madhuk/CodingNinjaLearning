package com.time.complexity;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		int d = scanner.nextInt();
		ArrayRotate.arrayRotate(a, d);
		scanner.close();
	}

	private static void arrayRotate(int[] a, int d) {
		if (d > a.length)
			d = d % a.length;

		for (int i = 0; i < d; i++) {
			int temp;
			for (int j = 0; j < a.length - 1; j++) {
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}

		System.out.println();

		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]);

		}
	}
}
