package com.java.arrays.search;

public class ReOrderAnArray {

	public static void reorderArray(int[] arr, int[] index) {
		int[] reordered = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			reordered[index[i]] = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = reordered[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 11, 12 };
		int[] index = { 1, 0, 2 };

		reorderArray(arr, index);

		// Print the updated array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
