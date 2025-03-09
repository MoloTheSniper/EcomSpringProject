package com.moloko.ecom_proj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moloko.ecom_proj.model.Product;
import com.moloko.ecom_proj.repository.ProductRepo;

@Service
public class ProductService 
{
	@Autowired
	ProductRepo repo;
	
	public List<Product> getAllProducts() {
		
		System.out.println(repo.findAll());
		return repo.findAll();
	}

}
