package com.krojas.sample.api.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
		http.csrf().disable();
		
		return http.build();
		
	}
}
