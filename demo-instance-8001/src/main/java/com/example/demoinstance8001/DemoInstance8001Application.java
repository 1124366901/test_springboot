package com.example.demoinstance8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DemoInstance8001Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoInstance8001Application.class, args);
	}

}
