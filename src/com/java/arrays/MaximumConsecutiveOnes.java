package com.java.arrays;

public class MaximumConsecutiveOnes {

	static int maxOnes(int[] arr, int k) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;

			for (int j = i; j < arr.length; j++) {
				if (arr[j] == 0)
					cnt++;

				if (cnt <= k)
					res = Math.max(res, (j - i + 1));
			}

		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        int k = 2;
        System.out.println(maxOnes(arr, k));
	}

}
