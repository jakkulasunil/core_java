package com.java.hashing.basic;

import java.util.ArrayList;

public class InterSectionOfTwoArrays {

	static ArrayList<Integer> intersect(int[] a, int[] b) {
		ArrayList<Integer> res = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j])
					if (!res.contains(a[i]))
						res.add(a[i]);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};

        ArrayList<Integer> res = intersect(a, b);

        for (int val : res) {
            System.out.print(val + " ");
        }
	}

}
