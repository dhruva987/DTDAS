package com.mindtree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.mindtree.service.TestService;

@SpringBootApplication
@EnableAsync
@EnableScheduling
@ComponentScan("com.mindtree")
public class PocSpringBootApplication extends AsyncConfigurerSupport{

	
	public static void main(String[] args) throws Exception {
	
		System.out.println("here");
		SpringApplication.run(PocSpringBootApplication.class, args);
		
		System.out.println("hello");
	}
}
