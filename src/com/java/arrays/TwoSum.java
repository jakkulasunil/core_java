package com.java.arrays;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

	static List<List<Integer>> findAllPairs(int[] arr, int target) {
		int n = arr.length;
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == target) {
					List<Integer> pair = new ArrayList<>();
					pair.add(i);
					pair.add(j);
					res.add(pair);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 20, 10, 30};
        int target = 50;
  
        List<List<Integer>> res = findAllPairs(arr, target);
        for(List<Integer> pair: res) {
            System.out.println(pair.get(0) + " " + pair.get(1));
        }
	}

}
