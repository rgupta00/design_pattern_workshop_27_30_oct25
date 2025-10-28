package com.salesforce.productapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
	private int id;
	private String name;
	private double price;
	public Product( String name, double price) {
	
		this.name = name;
		this.price = price;
	}

	
}
