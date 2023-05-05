package com.java.study;
// st
public class Calculator {

	
	public Calculator() {
		
		
	}
	

	public static int add(int x, int y) throws ExceptionOver, ExceptionZero {
		int result = x+y;
		if(result>1000)
			throw new ExceptionOver();
		
		if(result<0)
			throw new ExceptionZero();
		
		
		return result;
	}


	public static int sub(int x, int y) throws ExceptionZero {

		int result = x-y;
		
		
		if(result<0)
			throw new ExceptionZero();
		
		
		return result;
		
	
	}


	public static int multi(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}


	public static int div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}
	
	

}
