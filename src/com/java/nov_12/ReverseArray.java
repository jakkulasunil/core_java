package com.java.nov_12;

public class ReverseArray {

	public static void reverseAnArray(int[] arr) {
		int n = arr.length;
		int[] temp = new int[n];
		for (int i = 0; i < n; i++)
			temp[i] = arr[n - i - 1];
		for (int i = 0; i < n; i++)
			arr[i] = temp[i];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		reverseAnArray(arr);
		for (int i : arr) {
			System.out.print(i+",");
		}
	}

}
