package com.time.complexity;

import java.util.Scanner;

public class CalculatePower {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int x = s.nextInt();
		int n = s.nextInt();

		System.out.println(CalculatePower.power(x, n));
	}

	private static int power(int x, int n) {
		int pow = x;
		if (n == 0) {
			return 1;
		}

		pow = pow * power(x, n - 1);
		return pow;
	}

}
