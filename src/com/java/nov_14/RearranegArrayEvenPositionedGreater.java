package com.java.nov_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RearranegArrayEvenPositionedGreater {

	static ArrayList<Integer> rearrangeArray(ArrayList<Integer> arr) {
		Collections.sort(arr);
		int n = arr.size();

		ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n, 0));
		int ptr1 = 0;
		int ptr2 = n - 1;

		for (int i = 0; i < n; i++) {
			if ((i + 1) % 2 == 0) {
				result.set(i, arr.get(ptr2--));
			} else {
				result.set(i, arr.get(ptr1++));
			}
		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 4, 1));
		ArrayList<Integer> result = rearrangeArray(list);
		result.stream().forEach(e -> System.out.print(e + ","));

	}

}
