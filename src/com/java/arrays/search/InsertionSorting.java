package com.java.arrays.search;

public class InsertionSorting {

	static void sort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	
	static void printArray(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 11, 13, 5, 6 };
        sort(arr);
        printArray(arr);
		
	}

}
