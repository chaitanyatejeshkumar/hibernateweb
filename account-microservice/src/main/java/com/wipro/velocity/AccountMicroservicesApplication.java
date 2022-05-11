package com.wipro.velocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



/*
Application class is annotated with the @EnableDiscoveryClient (so that this application can be discovered as Eureka client, you can also use @EnableEurekaClient annotation instead of @EnableDiscoveryClient) along with the @SpringBootApplication annotation.
*/

@EnableEurekaClient
@SpringBootApplication
public class AccountMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMicroservicesApplication.class, args);
	}
	
}


