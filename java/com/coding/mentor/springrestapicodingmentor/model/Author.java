package com.coding.mentor.springrestapicodingmentor.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity

public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	   
private int id;

private String name;
@ManyToMany(mappedBy = "authors")
@JsonBackReference 
private Set<Product> products = new HashSet<>();


public Author() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Author(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Set<Product> getProducts() {
	return products;
}
public void setProducts(Set<Product> products) {
	this.products = products;
}
public Author(Set<Product> products, int id, String name) {
	super();
	this.products = products;
	this.id = id;
	this.name = name;
}

}
