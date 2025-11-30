package com.java.strings;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubstrings {

	static List<String> findSubstrings(String s) {
		ArrayList<String> res = new ArrayList<>();
		int n = s.length();
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				res.add(s.substring(i, j + 1));
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "abc";
	        List<String> res = findSubstrings(s);
	        for (String i : res) {
	            System.out.print(i + " ");
	        }

	}

}
