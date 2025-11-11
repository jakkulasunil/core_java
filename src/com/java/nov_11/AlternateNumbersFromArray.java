package com.java.nov_11;

import java.util.ArrayList;
import java.util.List;

public class AlternateNumbersFromArray {

	public static List<Integer> getAlternates(int[] arr) {
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < arr.length; i += 2) {
			res.add(arr[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 50 };
		List<Integer> alternate = getAlternates(arr);
		alternate.stream().forEach(e -> System.out.print(e+","));
	}

}
