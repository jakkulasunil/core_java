package com.java.nov_01;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1234;
		int sum = 0;
		while (n != 0) {
			int last = n % 10;
			sum += last;
			n = n / 10;
		}
		System.out.println("Sum of Digits: " + sum);

	}

}
