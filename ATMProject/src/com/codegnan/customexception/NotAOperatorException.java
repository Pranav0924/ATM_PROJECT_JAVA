package com.codegnan.customexception;

public class NotAOperatorException extends Exception{
	
	public NotAOperatorException(String errormsg) {
		super(errormsg);
	}

}