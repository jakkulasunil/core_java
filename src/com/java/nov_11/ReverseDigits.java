package com.java.nov_11;

public class ReverseDigits {

	public static int reversNum(int n) {
		int revNum = 0;
		while (n != 0) {
			revNum = revNum * 10 + n % 10;
			n = n / 10;

		}
		return revNum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1234;
		System.out.println(reversNum(n));
	}

}
