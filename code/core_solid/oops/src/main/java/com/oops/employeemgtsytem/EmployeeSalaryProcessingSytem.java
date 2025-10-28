package com.oops.employeemgtsytem;

public class EmployeeSalaryProcessingSytem {

	public static void processPayment(Payable payable) {
		//open a jdbc conn
		double amount = payable.payable();
		System.out.println("payable amount is: "+ amount);
		//put in db
	}
}
