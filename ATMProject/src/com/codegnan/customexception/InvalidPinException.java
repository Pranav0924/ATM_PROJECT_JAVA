package com.codegnan.customexception;

public class InvalidPinException extends Exception{
	
	public InvalidPinException(String errormsg) {
		super(errormsg);
	}

}