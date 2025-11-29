package com.java.strings;

public class DeleteCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder("HelloWelcome");
		int pos = 5;
		sb.deleteCharAt(pos);
		System.out.println(sb);
	}

}
