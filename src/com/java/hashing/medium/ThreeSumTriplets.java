package com.java.hashing.medium;

public class ThreeSumTriplets {

	static int countTriplets(int[] arr, int target) {

		int cnt = 0;
		int n = arr.length;

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						cnt += 1;
					}
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, -1, 2, -3, 1 };
		int target = -2;
		System.out.println(countTriplets(arr, target));
	}

}
