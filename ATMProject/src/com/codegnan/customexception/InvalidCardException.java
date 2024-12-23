package com.codegnan.customexception;

public class InvalidCardException extends Exception {
	public InvalidCardException(String errorMsg) {
		super(errorMsg);
	}

}
