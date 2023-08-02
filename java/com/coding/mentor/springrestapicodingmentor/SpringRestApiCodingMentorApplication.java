package com.coding.mentor.springrestapicodingmentor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({"com.example.demo","controller","service"})

public class SpringRestApiCodingMentorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiCodingMentorApplication.class, args);
	}

}
