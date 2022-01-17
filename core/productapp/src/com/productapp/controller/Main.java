package com.productapp.controller;

import java.sql.SQLException;

import com.productapp.model.exceptions.DataAccessException;
import com.productapp.model.repository.Product;
import com.productapp.model.service.ProductService;
import com.productapp.model.service.ProductServiceImpl;

public class Main {

	public static void main(String[] args) {
		ProductService productService=new ProductServiceImpl();
		Product product=new Product(11, "laptop", 67000, 3);
		try {
			productService.addProduct(product);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}
}
