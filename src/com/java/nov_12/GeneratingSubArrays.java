package com.java.nov_12;

import java.util.ArrayList;

public class GeneratingSubArrays {

	static void subArray(ArrayList<Integer> list) {
		int n = list.size();
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(list.get(k) + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> arr = new ArrayList<>();
	        arr.add(1);
	        arr.add(2);
	        arr.add(3);
	        arr.add(4);
	        System.out.println("All Non-empty Subarrays:");
	        subArray(arr);
	}

}
