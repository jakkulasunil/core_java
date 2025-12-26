package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortLengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        
        listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

	}

}
