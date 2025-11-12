package com.java.nov_12;

public class CheckIfArraySorted {

	static boolean isSorted(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++)
			if (arr[i-1] > arr[i])
				return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40, 50 };
		if (isSorted(arr)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
