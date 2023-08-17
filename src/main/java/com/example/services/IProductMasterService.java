package com.example.services;

import java.util.Optional;

import com.example.entities.ProductMaster;
import com.example.exceptions.ProductNotExistException;

public interface IProductMasterService
{
	public void addProduct(ProductMaster promaster);
	
	public Optional<ProductMaster> getProduct(long id) throws ProductNotExistException;
	
	public Optional<ProductMaster> deleteById(long id) throws ProductNotExistException;
	
	
	public Optional<ProductMaster> updateById(long id , ProductMaster obj);
	
	
}
