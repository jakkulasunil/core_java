package com.java.arrays;

public class MinLengthSubArray {

	static int smallestSubwithSum(int x, int[] arr) {

		int n = arr.length;
		int res = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			int curr = 0;
			for (int j = i; j < n; j++) {
				curr += arr[j];

				if (curr > x) {
					res = Math.min(res, j - i + 1);
					break;
				}
			}
		}

		if (res == Integer.MAX_VALUE)
			return 0;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		 int[] arr = {1, 4, 45, 6, 10, 19};
		 
	        int x = 51;

	        System.out.println(smallestSubwithSum(x, arr));

	}

}
