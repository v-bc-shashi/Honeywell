package com.spp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/api/v1/test")
public class TestController {

	@GetMapping
	public String testME() {
		
		return "This is working Rest controller !!!!!!!!!";
	}
}
