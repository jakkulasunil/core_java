package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lists=Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
		
		Map<String,Long> mostFrequentElement=lists.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		Entry<String, Long> most=mostFrequentElement.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		
		System.out.println("Most Frequent Element : "+most.getKey());
        
        System.out.println("Count : "+most.getValue());
	}

}
