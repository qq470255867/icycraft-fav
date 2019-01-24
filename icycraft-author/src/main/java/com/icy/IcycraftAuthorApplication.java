package com.icy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class IcycraftAuthorApplication {

	public static void main(String[] args) {
		SpringApplication.run(IcycraftAuthorApplication.class, args);
	}

}

