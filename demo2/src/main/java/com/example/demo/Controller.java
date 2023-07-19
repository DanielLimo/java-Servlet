package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	public String index1() {
		return "Hello Daniel";
	}
	@PostMapping("/post")
	public Object index(@RequestBody Object payload) {
		
		
		System.out.println(payload);
		return payload;
	}

}
