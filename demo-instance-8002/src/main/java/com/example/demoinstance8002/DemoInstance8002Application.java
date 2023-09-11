package com.example.demoinstance8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DemoInstance8002Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoInstance8002Application.class, args);
    }

}
