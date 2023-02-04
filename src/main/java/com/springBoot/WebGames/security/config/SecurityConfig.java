package com.springBoot.WebGames.security.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

// can put everything in @SpringBootApplication file since it is a @Configuration file too
// however this just spits the configuration files up into a separate area.
@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public InMemoryUserDetailsManager userDetailsManager() {
		UserDetails user = User.withDefaultPasswordEncoder()
			.username("user")
			.password("password")
			.roles("USER")
			.build();
		
		UserDetails admin = User.withDefaultPasswordEncoder()
				.username("admin")
				.password("password")
				.roles("ADMIN")
				.build();
		
		return new InMemoryUserDetailsManager(user, admin);
	}
	
	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {
		http
		.authorizeHttpRequests((requests) -> requests
			.anyRequest().permitAll()
		)
		.formLogin((form) -> form
			.loginPage("/login")
			.loginProcessingUrl("/authenticateTheUser")
			.defaultSuccessUrl("/", true)
			.permitAll()
		)
		.logout((logout) -> logout.permitAll());

	return http.build();
	}
	

}






















