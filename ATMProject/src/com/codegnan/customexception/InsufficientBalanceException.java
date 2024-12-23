package com.codegnan.customexception;

public class InsufficientBalanceException extends Exception{
	
	public InsufficientBalanceException(String errormsg) {
		super(errormsg);
	}

}