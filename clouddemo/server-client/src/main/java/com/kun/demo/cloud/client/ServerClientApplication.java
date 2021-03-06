package com.kun.demo.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServerClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerClientApplication.class, args );
    }
}
