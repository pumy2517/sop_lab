package com.example.configurationlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigurationlabApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationlabApplication.class, args);
	}

}
