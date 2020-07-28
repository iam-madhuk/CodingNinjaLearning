package com.recursion;

import java.util.Scanner;

public class FirstIndex {

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int[] input = new int[size];
		for (int i = 0; i < size; i++) {
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(FirstIndex.firstIndex(input, x));
	}

	private static int firstIndex(int[] input, int x) {
		if (input.length == 0)
			return -1;
		else if (input[0] == x) {
			return 0;
		}
		int smallArray[] = new int[input.length - 1];
		for (int i = 1; i < input.length; i++) {
			smallArray[i - 1] = input[i];

		}

		int in = firstIndex(smallArray, x);
		if (in == -1)
			return -1;
		else
			return in + 1;
	}
}
