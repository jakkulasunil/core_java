package com.java.nov_13;

public class MinIncrementByKOperations {

	static int minOps(int[] arr, int n, int k) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			max = Math.min(max, arr[i]);
		}
		int res = 0;
		for (int i = 0; i < n; i++) {
			if ((max - arr[i]) % k != 0)
				return -1;
			else
				res += (max - arr[i]) / k;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
