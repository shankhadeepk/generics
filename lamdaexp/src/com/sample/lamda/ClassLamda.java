package com.sample.lamda;

public class ClassLamda {	
	
	public static void main(String[] args) {
	
		LamdaIntr aBlockOfCode = () -> System.out.print("Hello World!!!");
		aBlockOfCode.foo();
	}

}

interface LamdaIntr{
	void foo();
}