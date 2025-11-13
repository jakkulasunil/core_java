package com.java.nov_13;

public class MinCostReduceToOne {

	static int cost(int[] arr, int n) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return (n - 1) * min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = { 4, 3, 2 };
        int n = a.length;
        
        System.out.println(cost(a, n));

	}

}
