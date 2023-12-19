package com.myexample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.myexample.demo.models")

public class MyExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyExampleApplication.class, args);
	}

}
