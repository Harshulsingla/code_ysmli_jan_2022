package com.productapp.model.repository;

import java.sql.SQLException;

import com.productapp.model.exceptions.DataAccessException;

public interface ProductDao {
	public void addProduct(Product product)throws DataAccessException;
}
