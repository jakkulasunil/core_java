package com.java.arrays;

import java.util.ArrayList;
import java.util.List;

public class ConstructAnArray {

	public static ArrayList<Integer> constructArr(int[] arr) {

		if (arr.length == 1) {
			return new ArrayList<>(List.of(1, arr[0] - 1));
		}

		int n = (int) ((1 + Math.sqrt(1 + 8 * arr.length)) / 2);

		int[] res = new int[n];

		res[0] = (arr[0] + arr[1] - arr[n - 1]) / 2;

		for (int i = 1; i < n; i++) {
			res[i] = arr[i - 1] - res[0];
		}

		ArrayList<Integer> list = new ArrayList<>(n);

		for (int x : res)
			list.add(x);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 5, 3};
        ArrayList<Integer> res = constructArr(arr);
        for (int x : res) System.out.print(x + " ");

	}

}
