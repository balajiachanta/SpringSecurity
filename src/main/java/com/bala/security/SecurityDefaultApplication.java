package com.bala.security;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SecurityDefaultApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SecurityDefaultApplication.class, args);
		Arrays.asList(ctx.getBeanDefinitionNames()).forEach(s -> System.out.println(s));
	}
	
	@GetMapping(value="/secure/sample" ,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String testJWT(){

		
		return "{\"success\":\"hey\"}";
		
		
	}
}
