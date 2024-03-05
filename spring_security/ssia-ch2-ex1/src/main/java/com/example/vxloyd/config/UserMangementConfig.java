package com.example.vxloyd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserMangementConfig {

	@Bean
    UserDetailsService userDetailsService() {
    	
    	var userDetailsService = new InMemoryUserDetailsManager();
		
    	var user = User.withUsername("randomUser")
    				.password("randomText")
    				.authorities("read")
    				.build();
    	
    	userDetailsService.createUser(user);
		return userDetailsService;
	}
   
    @Bean
    PasswordEncoder passwordEncoder() {
    	return NoOpPasswordEncoder.getInstance();
    }
}
