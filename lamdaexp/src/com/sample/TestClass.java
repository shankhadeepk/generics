package com.sample;

public class TestClass {
	
	public static void swap(ClassWrapper clA,ClassWrapper clAa){
		ClassA tmp=clA.objA;
		clA.objA=clAa.objA;
		clAa.objA=tmp;
	}
	
	public static void main(String[] args) {
		ClassA clA=new ClassA(10,"RED");
		ClassA clAa=new ClassA(12,"GREEN");
		ClassWrapper clAw=new ClassWrapper(clA);
		ClassWrapper clAaw=new ClassWrapper(clAa);
		
		System.out.println(clAw.objA+" "+clAaw.objA);
		
		swap(clAw,clAaw);
		
		System.out.println(clAw.objA+" "+clAaw.objA);
	}

}
