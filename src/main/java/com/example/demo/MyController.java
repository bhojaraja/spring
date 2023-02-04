package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@GetMapping("/")
	public String hello()
	{
		return " Dear All, This is the default Message from Spring Boot Application";
	}

@GetMapping("/welcome")
public String hello2()
{
	return " Dear All, This is the welcome  Message from Spring Boot Application";
}



}
