package com.salesforce.productapp.service;

import com.salesforce.productapp.dto.Product;
import com.salesforce.productapp.repo.ProductRepo;
import com.salesforce.productapp.repo.ProductRepoImpl;

public class ProductServiceImpl implements ProductService {
	private ProductRepo productRepo;
	private ValidationService validationService;
	
	
	public ProductServiceImpl() {
		productRepo=new ProductRepoImpl();
		validationService=new ValidationServiceImpl();
	}


	@Override
	public void addProduct(Product product) {
		if(validationService.valiation(product)) {
			productRepo.addProduct(product);
		}
	}

}
