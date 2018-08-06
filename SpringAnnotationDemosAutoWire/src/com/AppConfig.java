package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
	@Bean
	public Address getAddress() {
		return new Address();
	}
}
