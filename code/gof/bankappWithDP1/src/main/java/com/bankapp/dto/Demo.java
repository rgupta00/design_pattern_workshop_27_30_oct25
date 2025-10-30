package com.bankapp.dto;

import java.math.BigDecimal;

public class Demo {

	public static void main(String[] args) {
//		Account account=new Account(1, "raj", BigDecimal.valueOf(4999.00));
	
		Account account=
				Account.builder()
				.id(1)
				.name("raj")
				.balance(BigDecimal.valueOf(4999.00))
				.build();
		//java 8 streams
	}
}
