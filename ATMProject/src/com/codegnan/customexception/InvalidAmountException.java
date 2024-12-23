package com.codegnan.customexception;

public class InvalidAmountException extends Exception{
	
	public InvalidAmountException(String errormsg) {
		super(errormsg);
	}

}