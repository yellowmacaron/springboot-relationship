package com.coding.mentor.springrestapicodingmentor.repository;

import org.springframework.stereotype.Repository;

import com.coding.mentor.springrestapicodingmentor.model.User;

@Repository
public class UserRepository {
	public User getUser(User user) {
		//check if user.password +user.name exist in db;
		return user;}
}
