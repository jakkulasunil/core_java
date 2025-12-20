package com.java.hashing.basic;

public class FindMissingElements {
	static void findMissing(int[] arr, int low, int n, int high) {
		for (int i = low; i <= high; i++) {
			boolean found = false;
			for (int j = 0; j < n; j++) {
				if (arr[j] == i) {
					found = true;
					break;
				}

			}
			if (!found) {
				System.out.print(i + " ");
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input array
        int[] arr = { 1, 3, 5, 4 };
        int n = arr.length;
        int low = 1, high = 10;
        // Function call
        findMissing(arr, low, n, high);

	}

}
