package com.java.study;
//
public class ExceptionOver extends Exception {//RuntimeException 하면 unChecked 예외임 강제x
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return"천을 넘음";
	}
}
