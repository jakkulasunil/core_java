package com.java.hashing.medium;

public class LongestSubArray {

	static int longestSubArray(int[] arr, int k) {
		int res = 0;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;

			for (int j = i; j < arr.length; j++) {
				sum = (sum + arr[j]) % k;

				if (sum == 0)
					res = Math.max(res, j - i + 1);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 6, 1, 4, 5 };
		int k = 3;

		System.out.println(longestSubArray(arr, k));

	}

}
