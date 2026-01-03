package com.java.search.basic;

public class FirstRepeatingNumber {

	static int firstRepeatingNumber(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
		int n = arr.length;

		// Finding the index of first repeating element
		int index = firstRepeatingNumber(arr, n);

		// Checking if any repeating element is found or not
		if (index == -1) {
			System.out.println("No repeating element found!");
		} else {
			System.out.println("First repeating element is " + arr[index]);
		}
	}

}
