package com.icy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class IcycraftArticlesApplication {

	public static void main(String[] args) {
		SpringApplication.run(IcycraftArticlesApplication.class, args);
	}
}
