package com.time.complexity;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElement {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(DuplicateElement.findUnique(arr));
	}

	private static int findUnique(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		int res = 0;
		for (int i = 0; i < n; i++) {
			res = res ^ arr[i];
			if (res == 0) {
				return arr[i];
			}
		}
		return -1;
	}

}
