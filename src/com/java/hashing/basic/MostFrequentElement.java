package com.java.hashing.basic;

public class MostFrequentElement {
	static int mostFreqElement(int[] arr) {
		int n = arr.length;
		int maxCount = 0;
		int res = 0;

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j])
					count++;
			}

			if (count > maxCount || (count == maxCount && arr[i] > res)) {
				maxCount = count;
				res = arr[i];
			}
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
		System.out.println(mostFreqElement(arr));
	}

}
