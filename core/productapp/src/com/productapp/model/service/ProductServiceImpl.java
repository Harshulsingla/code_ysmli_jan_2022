package com.productapp.model.service;

import java.sql.SQLException;

import com.productapp.model.exceptions.DataAccessException;
import com.productapp.model.repository.Product;
import com.productapp.model.repository.ProductDao;
import com.productapp.model.repository.ProductDaoImpl;
import com.productapp.model.repository.ProductDaoImplHib;
import com.productapp.model.repository.ProductDaoImplMongdoDdb;

public class ProductServiceImpl implements ProductService {
	private ProductDao dao;
	
	public ProductServiceImpl() {
		this.dao = new ProductDaoImplMongdoDdb();
	}
	
	@Override
	public void addProduct(Product product) throws DataAccessException {
		//add some business logic*
		dao.addProduct(product);
	}

}
