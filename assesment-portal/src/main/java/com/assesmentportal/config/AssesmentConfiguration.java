//package com.assesmentportal.config;
//
//import java.util.Arrays;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.DefaultSecurityFilterChain;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//@Configuration
//@EnableWebSecurity
//public class AssesmentConfiguration {
//
//	@Bean
//	public DefaultSecurityFilterChain configure(HttpSecurity httpSecurity) throws Exception {
//		httpSecurity
//			.cors().configurationSource(corsConfigurationSource()).and()
//			.csrf().disable()
//			.formLogin().disable()
//			.httpBasic().disable()
//			.authorizeRequests().anyRequest().permitAll();
//		return httpSecurity.build();
//	}
//
//	@Bean
//	public CorsConfigurationSource corsConfigurationSource() {
//
//		CorsConfiguration configuration = new CorsConfiguration();
//		configuration.setAllowedOrigins(Arrays.asList("http://localhost:3000"));
//		configuration.setAllowedMethods(Arrays.asList("GET", "POST", "OPTIONS"));
//		configuration.setAllowedHeaders(Arrays.asList("Content-Type", "Access-Control-Allow-Origin"));
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		source.registerCorsConfiguration("/api/**", configuration);
//		return source;
//	}
//
//}