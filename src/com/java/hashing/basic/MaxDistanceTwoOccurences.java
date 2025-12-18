package com.java.hashing.basic;

import java.util.HashMap;

public class MaxDistanceTwoOccurences {

	static int maxDistance(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int res = 0;

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i]))
				map.put(arr[i], i);
			else
				res = Math.max(res, i - map.get(arr[i]));
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 2, 2, 2, 1 };
		System.out.println(maxDistance(arr));
	}

}
