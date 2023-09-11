package com.example.demospringcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoSpringcloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringcloudConfigApplication.class, args);
    }

}
