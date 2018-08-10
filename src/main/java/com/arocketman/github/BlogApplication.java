package com.arocketman.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages={
		"com.arocketman.github.config", "com.arocketman.github.controllers", "com.arocketman.github.entities", "com.arocketman.github.repositories", "com.arocketman.github.service"})
public class BlogApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BlogApplication.class);
	}
}
