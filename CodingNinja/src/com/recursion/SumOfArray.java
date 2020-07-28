package com.recursion;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		System.out.println(printSumofArray(a));
		scanner.close();
	}

	private static int printSumofArray(int a[]) {
		if (a.length == 1) {
			return a[0];
		}

		int smallArray[] = new int[a.length - 1];
		for (int i = 1; i < a.length; i++) {
			smallArray[i - 1] = a[i];

		}
		int total = printSumofArray(smallArray);

		total += a[0];

		return total;
	}

}
