package com.salesforce.productapp.controller;

import java.sql.SQLException;

import com.salesforce.productapp.dto.Product;
import com.salesforce.productapp.service.ProductService;
import com.salesforce.productapp.service.ProductServiceImpl;

public class Main {

	public static void main(String[] args) throws SQLException {

		ProductService productService=new ProductServiceImpl();
		productService.addProduct(new Product( "pen holder", 120));
	}
}
