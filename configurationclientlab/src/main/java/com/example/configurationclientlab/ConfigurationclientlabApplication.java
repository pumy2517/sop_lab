package com.example.configurationclientlab;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Component
@RestController
public class ConfigurationclientlabApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigurationclientlabApplication.class, args);
	}

	@Value("${test}")
	private String exampleProperty;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getExampleProperty() {
		return exampleProperty;
	}


}
