package com.example.demoinstance8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.example.demoinstance8001"})
public class DemoInstance8001Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoInstance8001Application.class, args);
	}

}
