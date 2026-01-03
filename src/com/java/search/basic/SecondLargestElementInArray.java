package com.java.search.basic;

public class SecondLargestElementInArray {

	public static int secondLargest(int[] arr, int n) {
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] > first)
				first = arr[i];
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] > second && arr[i] != first)
				second = arr[i];
		}
		return second;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 35, 1, 10, 34, 1 };
		System.out.println(secondLargest(arr, arr.length));
	}

}
