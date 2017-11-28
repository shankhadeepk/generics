package com.sample;

public class ClassA {
	
	private int intA;
	private String strA;
	ClassA(int intA,String strA){
		this.intA=intA;
		this.strA=strA;
	}
	@Override
	public String toString() {
		return "ClassA [intA=" + intA + ", strA=" + strA + "]";
	}
}
