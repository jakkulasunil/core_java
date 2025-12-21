package com.java.hashing.basic;

import java.util.HashSet;

public class MissingElementsOfRangeInArray {

	public static int countNum(int[] arr) {
		HashSet<Integer> s = new HashSet<>();
		int maxM = Integer.MIN_VALUE, minM = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
			if (arr[i] < minM)
				minM = arr[i];
			if (arr[i] > maxM) {
				maxM = arr[i];
			}

		}

		 return (maxM - minM + 1) - s.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 8, 6 };
        System.out.println(countNum(arr));
	}

}
