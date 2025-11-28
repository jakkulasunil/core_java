package com.java.arrays;

public class ThreeSum {

	static boolean tripletSum(int[] arr, int target) {
		int n = arr.length;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
	    int[] arr = { 1, 4, 45, 6, 10, 8 };
        int target = 13;
        
        if (tripletSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }

	}

