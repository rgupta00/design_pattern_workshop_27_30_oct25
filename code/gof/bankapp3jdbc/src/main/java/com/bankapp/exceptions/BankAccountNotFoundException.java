package com.bankapp.exceptions;
//RuntimeException happens at runtime and compile time ex happen at compile time
//F
public class BankAccountNotFoundException extends RuntimeException{

	public BankAccountNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
