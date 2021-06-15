package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class GreetingComponent {
	
	public String getMsg() {
		return "Hello from GreetingComponent";
	}
}
