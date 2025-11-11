package com.java.nov_11;

public class PalindromeNumber {

	public static boolean checkPalindrome(int n) {
		int rev = 0;
		int temp = Math.abs(n);
		while (temp != 0) {
			rev = (rev * 10) + (temp % 10);
			temp = temp / 10;
		}
		return (rev == Math.abs(n));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1221;
		if(checkPalindrome(num)==true) {
			System.out.println("it's a palindrome");
		}
		else {
			System.out.println("Nooo");
		}

	}

}
