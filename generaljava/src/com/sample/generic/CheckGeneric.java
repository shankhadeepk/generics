package com.sample.generic;

public class CheckGeneric {
	
	public <T> void adding(Adder<T> adder,T a, T b){
		System.out.println(adder.add(a, b));
	}

	public static void main(String[] args) {
		CheckGeneric generic=new CheckGeneric();
		Adder<String> adder=new StringConcat();
		generic.adding(adder, "Shankha", "Deep");
		Adder<Integer> adder2=new IntAdd();
		generic.adding(adder2, 22, 22);
	}
}
