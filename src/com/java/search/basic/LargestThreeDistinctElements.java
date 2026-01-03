package com.java.search.basic;

import java.util.ArrayList;
import java.util.List;

public class LargestThreeDistinctElements {

	public static List<Integer> get3Largest(int[] arr, int n) {

		int fst = Integer.MIN_VALUE, sec = Integer.MIN_VALUE, thd = Integer.MIN_VALUE;

		for (int x : arr) {
			if (x > fst) {
				thd = sec;
				sec = fst;
				fst = x;
			} else if (x > sec && x != fst) {
				thd = sec;
				sec = x;
			} else if (x > thd && x != sec && x != fst) {
				thd = x;

			}
		}

		List<Integer> res = new ArrayList<>();
		if (fst == Integer.MIN_VALUE)
			return res;
		res.add(fst);

		if (sec == Integer.MIN_VALUE)
			return res;
		res.add(sec);

		if (thd == Integer.MIN_VALUE)
			return res;
		res.add(thd);

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {12, 13, 1, 10, 34, 1};
	        List<Integer> res = get3Largest(arr,arr.length);
	        for (int x : res) {
	            System.out.print(x + " ");
	        }
	        System.out.println();
	}

}
