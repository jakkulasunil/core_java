package com.java.nov_14;

public class SumOfAllSubArrays {

	static int sumOfSubarrays(int[] arr) {
		int n = arr.length;
		int result = 0;
		for (int i = 0; i < n; i++) {
			int temp = 0;
			for (int j = i; j < n; j++) {
				temp += arr[j];
				result += temp;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		int result = sumOfSubarrays(arr);
		System.out.println(result);
	}

}
