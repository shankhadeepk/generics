package com.sample.generic;

public class IntAdd implements Adder<Integer> {

	@Override
	public Integer add(Integer a, Integer b) {
		
		return a + b;
	}

}
