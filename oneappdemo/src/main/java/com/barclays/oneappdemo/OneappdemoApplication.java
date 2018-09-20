package com.barclays.oneappdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.barclays")
public class OneappdemoApplication {

	//This is a starting method.
	public static void main(String[] args) {

		SpringApplication.run(OneappdemoApplication.class, args);
	}
}

