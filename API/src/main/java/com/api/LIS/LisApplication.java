package com.api.LIS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LisApplication {

	public static void main(String[] args) {
		SpringApplication.run(LisApplication.class, args);

		System.out.println("API lanzada correctamente.");
	}

}
