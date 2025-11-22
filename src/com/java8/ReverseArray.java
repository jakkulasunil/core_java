package com.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 1, 7, 3, 9, 6 };
		int[] reverse = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
		System.out.println(Arrays.toString(reverse));

	}

}
