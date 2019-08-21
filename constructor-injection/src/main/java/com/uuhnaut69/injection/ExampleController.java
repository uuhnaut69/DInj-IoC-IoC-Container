package com.uuhnaut69.injection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	private final ExampleService services;

	public ExampleController(ExampleService services) {
		this.services = services;
	}

	@GetMapping("/")
	public void getValue() {
		services.getValue();
	}
}
