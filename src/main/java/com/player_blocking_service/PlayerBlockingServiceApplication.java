package com.player_blocking_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayerBlockingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayerBlockingServiceApplication.class, args);
		System.out.println("Server with blocking service is running on port 8081");
	}

}
