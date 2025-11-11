package com.java.nov_11;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
	public static List<Integer> findLeadersInArray(int[] arr) {
		List<Integer> res = new ArrayList<>();
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int j;
			for (j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) 
					break;
			}
				if (j == n) 
					res.add(arr[i]);
			
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 16, 18, 4, 3, 7, 2 };
		List<Integer> result = findLeadersInArray(arr);
		for (int res : result) {
			System.out.print(res+" ");
		}
		System.out.println("");

	}

}
