package com.springboot.restaurant.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.restaurant")
@EnableJpaRepositories
public class SpringbootRestaurantAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestaurantAppApplication.class, args);
	}

}
