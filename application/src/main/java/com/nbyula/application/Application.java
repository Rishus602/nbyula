package com.nbyula.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication
@RestController


public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

@CrossOrigin
	@GetMapping("/hello")
	public String hello(@RequestParam (value="name", defaultValue = "springboot")String name){
return String.format( "Hello %s", name);


	}
}
