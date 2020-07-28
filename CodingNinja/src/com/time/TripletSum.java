package com.time;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {
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
		TripletSum.FindTriplet(arr, num);
	}

	private static void FindTriplet(int[] arr, int sum) {
		int n = arr.length;
		for (int i = 0; i < (n - 2); i++) {
			for (int j = i + 1; j < (n - 1); j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == sum) {
						int max = Math.max(arr[i], Math.max(arr[j], arr[k]));
						int min = Math.min(arr[i], Math.min(arr[j], arr[k]));
						int mid = sum - max - min;
						System.out.println(min + " " + mid + " " + max);
					}
				}
			}
		}
	}
}
