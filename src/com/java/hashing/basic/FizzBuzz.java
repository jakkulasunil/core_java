package com.java.hashing.basic;

import java.util.ArrayList;

public class FizzBuzz {

	public static ArrayList<String> fizzBuzz(int n) {
		ArrayList<String> res = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			String s = "";
			if (i % 3 == 0)
				s += "Fizz";
			if (i % 5 == 0)
				s += "Buzz";
			if (s.isEmpty())
				s += i;
			res.add(s);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		ArrayList<String> res = fizzBuzz(n);

		for (String s : res) {
			System.out.print(s + " ");
		}

	}

}
