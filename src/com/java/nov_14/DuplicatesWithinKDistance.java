package com.java.nov_14;

public class DuplicatesWithinKDistance {

	static boolean duplicatesWithinK(int[] arr, int n, int k) {
		for (int i = 0; i < n; i++) {
			for (int c = 1; c <= k && c < n; c++) {
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
	        System.out.println(duplicatesWithinK(arr,arr.length, 3) ? "Yes" : "No");
	}

}
