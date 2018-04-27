package com.priyam.fyle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.priyam.fyle")
public class FyleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FyleApplication.class, args);
	}
}
