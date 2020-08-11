package com.recursion;

import java.util.Scanner;

public class CountZero {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(CountZero.countZerosRec(n));
	}

	private static int countZerosRec(int n) {
		if (n == 0) {
			return 0;
		}

		if (n % 10 != 0) {
			return countZerosRec(n / 10);
		} else {
			int sum = 1+ countZerosRec(n / 10);
			return sum;

		}

	}
}
