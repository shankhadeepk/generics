package com.sample.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LamdaNumbers {
	
	public static void main(String[] args) {
		
		
	// Usage of filer
		LamdaNumbers l=new LamdaNumbers();
		l.squareOfMaxodd(Arrays.asList(12,22,33,99,3,9)).
		forEach(x -> System.out.println(x));
		
		
	// Usage of map with simple stream
		List<Integer> arrList=Arrays.asList(22,44,55).stream().
				map(x -> x*x).collect(Collectors.toList());
		
		arrList.forEach(System.out::println);
		
	// Map with parallel stream
		List<Integer> arrList2=Arrays.asList(22,44,55).parallelStream().
				map(x -> x*x).collect(Collectors.toList());
		
		arrList2.forEach(System.out::println);
		

	//Use filter with Map
		Map<String,String> hostName=new HashMap<>();
		hostName.put("1", "Shankhadeep");
		hostName.put("2", "Shankhadeep-2");
		hostName.put("3", "Shankhadeep-3");
		hostName.put("4", "Shankhadeep-4");
		hostName.put("5", "Shankhadeep-5");
		
		String result= hostName.entrySet().stream()
						.filter(x -> x.getValue().contains("-") )
						.map(x -> x.getValue())
						.collect(Collectors.joining(","));
		
		System.out.println("Result of Map::"+result);
		
	}
	public List<Integer> squareOfMaxodd(List<Integer> numbers) {		
		return numbers.stream()
					  .filter(LamdaNumbers::isOdd)
					  .filter(LamdaNumbers::isGreather3)
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
