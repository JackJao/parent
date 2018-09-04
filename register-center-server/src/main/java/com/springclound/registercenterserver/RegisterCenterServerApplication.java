package com.springclound.registercenterserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegisterCenterServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterCenterServerApplication.class, args);
	}
}
