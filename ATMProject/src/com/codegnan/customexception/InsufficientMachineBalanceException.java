package com.codegnan.customexception;

public class InsufficientMachineBalanceException extends Exception{
	
	public InsufficientMachineBalanceException(String errormsg) {
		super(errormsg);
	}

}