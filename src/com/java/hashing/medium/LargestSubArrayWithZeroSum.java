package com.java.hashing.medium;

public class LargestSubArrayWithZeroSum {

	public static int maxLen(int[] arr) {

		int n = arr.length;

		int maxLen = 0;

		for (int i = 0; i < n; i++) {
			int currSum = 0;
			for (int j = i; j < n; j++) {
				currSum += arr[j];

				if (currSum == 0) {
					maxLen = Math.max(maxLen, j - i + 1);
				}
			}
		}

		return maxLen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15, -2, 2, -8, 1, 7, 10};
        System.out.println(maxLen(arr));

	}

}
