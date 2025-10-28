package com.salesforce.productapp.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.salesforce.productapp.dto.Product;
import com.salesforce.productapp.repo.factories.ConnectionFactory;

public class ProductRepoImpl implements ProductRepo {

	private Connection connection;

	public ProductRepoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public void addProduct(Product product) {
		try {

			PreparedStatement pstmt = connection.prepareStatement("insert into product(name,price) values(?,?)");
			pstmt.setString(1, product.getName());
			pstmt.setDouble(2, product.getPrice());

			pstmt.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
