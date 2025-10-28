package com.oops.employeemgtsytem;

public class Invoice implements Payable{
	private String regNo;
	private String name;
	private int noOfDays;
	private int ratePerDay;

	public Invoice(String regNo, String name, int noOfDays, int ratePerDay) {
		this.regNo = regNo;
		this.name = name;
		this.noOfDays = noOfDays;
		this.ratePerDay = ratePerDay;
	}


	@Override
	public double payable() {
		return noOfDays * ratePerDay * 0.7;
	}

}
