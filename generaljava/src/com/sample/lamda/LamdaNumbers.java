package com.sample.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaNumbers {
	
	public static void main(String[] args) {
		LamdaNumbers l=new LamdaNumbers();
		l.squareOfMaxodd(Arrays.asList(12,22,33,99)).forEach(x -> System.out.println(x));		
	}
	public List<Integer> squareOfMaxodd(List<Integer> numbers) {		
		return numbers.stream()
					  .filter(LamdaNumbers::isOdd)
					  .collect(Collectors.toList());
		
	}
	public static boolean isOdd(int i) {
		return i%2 != 0;
	}
	public static boolean isGreather3(int i) {
		return i > 3;
	}
	public static boolean isLessThan11(int i) {
		return i < 11;
	}
}
