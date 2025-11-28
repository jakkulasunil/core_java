package com.java.arrays;

public class LongestSubarraySum {

	static int maxLen(int[] arr) {
		int res = 0;
		for (int s = 0; s < arr.length; s++) {
			int sum = 0;

			for (int e = s; e < arr.length; e++) {
				sum += (arr[e] == 0) ? -1 : 1;
				if (sum == 0)
					res = Math.max(res, e - s + 1);
			}
		}

		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 0, 0, 1, 0, 1, 1};
        System.out.println(maxLen(arr));
	}

}
