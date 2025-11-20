package com.java.arrays;

public class MaxSuminSubArray {

	static int maxSum(int[] arr, int n, int k) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n - k + 1; i++) {
			int currSum = 0;
			for (int j = 0; j < k; j++)
				currSum += arr[i + j];
			max = Math.max(currSum, max);
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 2, -1, 0, 3};
        int k = 3;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));

	}

}
