package com.java8;

import java.util.stream.IntStream;

public class FirstTenEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(i -> System.out.print(i + " "));

	}

}
