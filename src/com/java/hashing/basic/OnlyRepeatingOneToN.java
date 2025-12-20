package com.java.hashing.basic;

public class OnlyRepeatingOneToN {

	static int findDuplicate(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j])
					return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 2, 3, 4};
        System.out.println(findDuplicate(arr));
	}

}
