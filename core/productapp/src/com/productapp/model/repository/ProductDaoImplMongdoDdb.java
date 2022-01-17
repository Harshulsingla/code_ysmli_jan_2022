package com.productapp.model.repository;

import com.productapp.model.exceptions.DataAccessException;
import com.productapp.model.exceptions.MongoDbException;

public class ProductDaoImplMongdoDdb implements ProductDao{

	@Override
	public void addProduct(Product product)throws DataAccessException {
		System.out.println("product added to database using mongdodb");
		try {
			
		
			if(1==2)
				throw new MongoDbException();
		}catch(MongoDbException ex) {
			throw new DataAccessException(ex);
		}
	}

}
