package com.java.arrays.search;

public class RearrangeAnArray {

	static void modifyArray(int[] arr, int n) {
		int i, j, temp;

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {

				if (arr[j] == i) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					break;
				}
			}
		}

		for (i = 0; i < n; i++) {
			if (arr[i] != i) {

				arr[i] = -1;
			}
		}

		for (i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, ar[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		n = ar.length;

		modifyArray(ar, n);

	}

}
