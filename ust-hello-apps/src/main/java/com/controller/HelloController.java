package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.CredentialConfiguration;

@RestController
public class HelloController {
	
	@Autowired
	CredentialConfiguration credentialconfiguration;
	@Value("${welcome.message}")
	private String welcomeMessage;
	
	@RequestMapping("/hello")
	public String sayHelloo() {
		return "Welcome to first spring hello app2";
	}
	
	@RequestMapping("/example3")
	public String Example3() {
		return "running this app";
	}
	@RequestMapping("/ex")
	public String Example4() {
		return "hello from hello controller and the welcome message is:" +welcomeMessage;
	}
	@RequestMapping("/printCredentials")
	public String hello() {
		return "Username is:"+credentialconfiguration.getUsername()+'\n'
				+"password:"+credentialconfiguration.getUsername()+'\n'
				+"secretqustio:"+credentialconfiguration.getUsername()+'\n'
				+"secretanswer:"+credentialconfiguration.getUsername()+'\n';
}
}