package com.java.arrays;

import java.util.ArrayList;
import java.util.List;

public class Foursum {

	static List<Integer> findQuadruplet(int[] arr, int target) {
		int n = arr.length;

		for (int i = 0; i < n - 3; i++) {
			for (int j = i + 1; j < n - 2; j++) {
				for (int k = j + 1; k < n - 1; k++) {
					for (int l = k + 1; l < n; l++) {
						int currSum = arr[i] + arr[j] + arr[k] + arr[l];

						if (currSum == target) {
							List<Integer> result = new ArrayList<>();
							result.add(arr[i]);
							result.add(arr[j]);
							result.add(arr[k]);
							result.add(arr[l]);
							return result;
						}
					}
				}
			}
		}
		return new ArrayList<>();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 6, 8, 1, 3}; 
        int target = 15; 
        
        List<Integer> res = findQuadruplet(arr, target);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }

	}

}
