package com.java.hashing.medium;

public class CheckIfArraySumDivisibleByK {

	public static boolean countPairs(int[] arr, int k) {
		int n = arr.length;
		int count = 0;
		boolean[] vis = new boolean[n];
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((arr[i] + arr[j]) % k == 0 && !vis[i] && !vis[j]) {
					count++;
					vis[i] = true;
					vis[j] = true;
				}
			}

		}
		return (count == n / 2);

	}

	
	public static void main(String[] args) {
		 int[] arr = {92, 75, 65, 48, 45, 35};
	        int k = 10;
	        System.out.println(countPairs(arr, k) ? "True" : "False");
	}
}
