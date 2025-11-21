package com.java8;

import java.util.Arrays;
import java.util.List;

public class FindStringStartWithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOfStrings=Arrays.asList("One","2wo","Three","Four");
		listOfStrings.stream().filter(e->Character.isDigit(e.charAt(0))).forEach(e->System.out.println(e+" "));
		

	}

}
