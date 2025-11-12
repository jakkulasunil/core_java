package com.java.nov_12;

public class ArrayRotation {

	public static void rotationArray(int[] arr, int d) {
		int n = arr.length;

		for (int i = 0; i < d; i++) {
			int last = arr[n - 1];
			for (int j = n - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int d = 2;

		rotationArray(arr, d);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
