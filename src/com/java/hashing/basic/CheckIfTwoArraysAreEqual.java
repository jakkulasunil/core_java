package com.java.hashing.basic;

import java.util.Arrays;

public class CheckIfTwoArraysAreEqual {

	static boolean checkArrays(int[] a, int[] b) {
		if (a.length != b.length)
			return false;

		Arrays.sort(a);
		Arrays.sort(b);

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = { 3, 5, 2, 5, 2 };
	        int[] b = { 2, 3, 5, 5, 2 };
	        if (checkArrays(a, b))
	            System.out.println("true");
	        else
	            System.out.println("false");
	}

}
