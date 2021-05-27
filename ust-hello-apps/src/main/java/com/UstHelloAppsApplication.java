package com;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
//@ComponentScan(basePackages="com.controller")
public class UstHelloAppsApplication {
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(UstHelloAppsApplication.class, args);
		String []beanNames= ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String bn:beanNames) {
			System.out.println(bn);
		}
	}
	
	
	
		@RequestMapping("/")
		public String sayHello() {
			return "Welcome to first spring hello app";
		}
		
		@RequestMapping("/example")
		public String Example() {
			return "Hello World";
		}
		@RequestMapping("/ust")
		public String Example2() {
			return "hello app";
		}
		
		@RequestMapping("/ust1")
		public String UstMsg() {
			return "hello message";
		}
	
}
