package com.coding.mentor.springrestapicodingmentor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coding.mentor.springrestapicodingmentor.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{
	
}
