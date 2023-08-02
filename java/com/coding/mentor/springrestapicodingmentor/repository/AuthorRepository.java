package com.coding.mentor.springrestapicodingmentor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coding.mentor.springrestapicodingmentor.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}