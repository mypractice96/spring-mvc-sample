package com.sample.springbootsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sample.springbootsample.controller"})
public class SpringbootsampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootsampleApplication.class, args);
	}

}
