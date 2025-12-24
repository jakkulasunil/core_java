package com.java.hashing.medium;

import java.util.ArrayList;

public class TripletsSumZero {
	
	static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int target){
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		int n=arr.length;
		int cnt=0;
		 for (int i = 0; i < n - 2; i++) {
	            for (int j = i + 1; j < n - 1; j++) {
	                for (int k = j + 1; k < n; k++) {
	                  
	                    // If the sum of triplet equals to zero
	                    // then add it's indexes to the result
	                    if (arr[i] + arr[j] + arr[k] == 0) {
	                        ArrayList<Integer> triplet = new ArrayList<>();
	                        triplet.add(i);
	                        triplet.add(j);
	                        triplet.add(k);
	                        res.add(triplet);
	                    }
	                }
	            }
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
