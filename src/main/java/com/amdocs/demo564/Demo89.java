package com.amdocs.demo564;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Demo89 {
	@GetMapping("/in")
	public String show() {
		return "Welcome to spring boot and jenkins";
	}

}
