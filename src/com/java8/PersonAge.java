package com.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PersonAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate birthDay=LocalDate.of(1985, 11, 12);
		LocalDate today=LocalDate.now();
		System.out.println(ChronoUnit.YEARS.between(birthDay, today));

	}

}
