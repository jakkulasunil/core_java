package com.java.arrays;

public class LongestSpanwithSameSum {

	static int equalSum(int[] a1, int[] a2) {

		 int n = a1.length;
	        int maxLen = 0;
	        
	        for (int i = 0; i < n; i++) {
	            int prefixSum1 = 0, prefixSum2 = 0;
	            for (int j = i; j < n; j++) {
	                prefixSum1 += a1[j];
	                prefixSum2 += a2[j];
	                
	                if (prefixSum1 == prefixSum2) {
	                    maxLen = Math.max(maxLen, j - i + 1);
	                }
	            }
	        }
	        
	        return maxLen;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = { 0, 1, 0, 0, 0, 0 };
		int[] a2 = { 1, 0, 1, 0, 0, 1 };
		System.out.println(equalSum(a1, a2));
	}

}
