package com.java.search.basic;

public class LargestElementInArray {

	public static int largestElement(int[] arr) {
		int n = arr.length;
		int max = arr[0];

		for (int i = 1; i < n; i++)
			if (arr[i] > max) 
				max = arr[i];
				return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,12,6,9};
		int result=largestElement(arr);
		System.out.println(result);

	}

}
