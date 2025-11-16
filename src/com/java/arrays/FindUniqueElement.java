package com.java.arrays;

public class FindUniqueElement {

	public static int uniqueElement(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				return arr[i];
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 5, 4, 5, 3, 4};
        System.out.println(uniqueElement(arr));
	}

}
