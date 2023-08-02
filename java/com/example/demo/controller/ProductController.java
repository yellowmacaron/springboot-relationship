package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coding.mentor.springrestapicodingmentor.model.Product;

import com.coding.mentor.springrestapicodingmentor.repository.ProductRepository;

import jakarta.websocket.server.PathParam;

@RestController
public class ProductController{
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/products")
	public List<Product> getProductName() {
		return productRepository.findAll();
	}
	//@GetMapping("/products1")
	//public List<Product> getProducts() {
	//	List<Product>list=new ArrayList<Product>();
		//list.add(new Product(1,"aa",2));
		//list.add(new Product(2,"bb",2));
		//return list;
	//}
	@PostMapping("/product")
	public void addProduct(@RequestBody Product product) {
		System.out.println(product.toString());
	}
	@GetMapping("/product/{id}")
	public Product getIdFromPath(@PathVariable int id) {
		return productRepository.findById(id).get();
	}
}
