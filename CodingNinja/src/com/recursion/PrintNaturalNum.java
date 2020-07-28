package com.recursion;

import java.util.Scanner;

public class PrintNaturalNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		PrintNaturalNum.print(n);

	}

	private static void print(int n) {
		if (n == 0) {
			return;
		}

		print(n - 1);
		System.out.print(n + " ");

	}

}
