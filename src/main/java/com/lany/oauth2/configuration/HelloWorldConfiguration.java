package com.lany.oauth2.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
/**
 * http://websystique.com/spring-security/secure-spring-rest-api-using-oauth2/
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.lany.oauth2")
public class HelloWorldConfiguration {
	

}