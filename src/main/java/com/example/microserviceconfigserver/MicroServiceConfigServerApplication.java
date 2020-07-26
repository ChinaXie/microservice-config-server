package com.example.microserviceconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroServiceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceConfigServerApplication.class, args);
	}

}
