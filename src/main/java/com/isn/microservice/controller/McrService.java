package com.isn.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class McrService {
	
	@Value("#{'${mcr.values}'.split(',')}")
	private List<String> valuesList;

	@GetMapping("/values")
	public List<String> getValues(){
		return valuesList;
	}

}
