package com.java.hashing.basic;

public class CountPairsWithGivenDiff {

	public static int countPairs(int[] arr, int k) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (Math.abs(arr[i] - arr[j]) == k) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 4, 1, 4, 5};
         int k = 3;
 
        System.out.println(countPairs(arr, k));

	}

}
