package com.sample.runtimeexcep;

public class RunTimeExceptionTest {
	
	public static void main(String[] args) {
		
		RunTimeExceptionTest r=new RunTimeExceptionTest();
		r.checkException();
		
	}
	public void checkException() throws NullPointerException{
		System.out.println("executed");
		throw new NullPointerException();
	}

}
