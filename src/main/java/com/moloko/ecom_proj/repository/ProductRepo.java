package com.moloko.ecom_proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moloko.ecom_proj.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>
{

}
