package com.icy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class IcycraftIndexApplication {

	public static void main(String[] args) {
		SpringApplication.run(IcycraftIndexApplication.class, args);
	}
}
