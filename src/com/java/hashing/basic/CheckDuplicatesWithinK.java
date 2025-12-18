package com.java.hashing.basic;

public class CheckDuplicatesWithinK {

	static boolean checkDuplicatesWithinK(int[] arr, int k) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int c = 1; c <= k && (i + c) < n; c++) {
				int j = i + c;
				if (arr[i] == arr[j])
					return true;

			}
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr = {10, 5, 3, 4, 3, 5, 6};
	     System.out.println(checkDuplicatesWithinK(arr, 3) ? "Yes" : "No");
	}

}
