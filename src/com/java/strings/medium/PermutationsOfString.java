package com.java.strings.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationsOfString {

	static void permute(int index, StringBuilder s, List<String> ans) {

		if (index == s.length()) {
			ans.add(s.toString());
			return;
		}

		for (int i = index; i < s.length(); i++) {
			swap(s, index, i);
			permute(index + 1, s, ans);
			swap(s, index, i);
		}
	}

	static List<String> findPermutation(String str) {
		List<String> ans = new ArrayList<String>();
		StringBuilder sb=new StringBuilder(str);
		permute(0, sb, ans);
		Collections.sort(ans);
		return ans;
	}

	public static void swap(StringBuilder s, int i, int j) {
		char temp = s.charAt(i);
		s.setCharAt(i, s.charAt(j));
		s.setCharAt(j, temp);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
