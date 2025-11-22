package com.java8;

import java.util.stream.IntStream;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=IntStream.range(1, 10).sum();
		System.out.println(sum);

	}

}
