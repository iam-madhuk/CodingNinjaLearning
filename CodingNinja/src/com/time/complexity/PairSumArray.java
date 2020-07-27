package com.time.complexity;

import java.util.Arrays;
import java.util.Scanner;

public class PairSumArray {
	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s.nextInt();
		PairSumArray.pairSum(arr, num);
	}

	private static void pairSum(int[] arr, int num) {

		Arrays.sort(arr);
		int i = 0, j = arr.length - 1;
		while (i < j) {

			if (arr[i] + arr[j] == num) {
				System.out.println(arr[i] + " " + arr[j]);
				i = i + 1;

			} else if (arr[i] + arr[j] < num) {
				i = i + 1;
			} else if (arr[i] + arr[j] > num) {
				j = j - 1;
			}

		}

	}
}
