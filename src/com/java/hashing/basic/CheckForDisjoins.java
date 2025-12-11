package com.java.hashing.basic;

public class CheckForDisjoins {

	public static boolean disjoints(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j])
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12, 34, 11, 9, 3};
        int[] b = {7, 2, 1, 5};
        
        if(disjoints(a, b))
            System.out.println("True");
        else
            System.out.println("False");
	}

}
