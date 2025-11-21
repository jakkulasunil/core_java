package com.java8;

import java.util.Arrays;
import java.util.List;

public class LastElementOfanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lists = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
		String lastElement = lists.stream().skip(lists.size()-1).findFirst().get();
		System.out.println(lastElement);

	}

}
