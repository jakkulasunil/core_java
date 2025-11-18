package com.java.arrays;

public class MaxSubArraySum {
	static int maxSubarraySum(int[] arr) {
		int n = arr.length;
		int res = arr[0];
		for (int i = 0; i < n; i++) {
			int currSum = 0;
			for (int j = i; j < n; j++) {
				currSum = currSum + arr[j];
				res = Math.max(res, currSum);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
	}

}
