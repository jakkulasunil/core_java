package com.java.arrays.search;

public class BinarySearch {

	static int binarySearchImp(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] < x)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = binarySearchImp(arr, x);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at "
                               + "index " + result);
	}

}
