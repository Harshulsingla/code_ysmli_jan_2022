package com.productapp.model.service;

import java.sql.SQLException;

import com.productapp.model.exceptions.DataAccessException;
import com.productapp.model.repository.Product;

public interface ProductService {
	public void addProduct(Product product)throws DataAccessException;
}
