package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ServiceInjection;

@RestController
public class ControllerInjection {

	private ServiceInjection in;	
	
	public ControllerInjection(ServiceInjection in) {
		
		this.in = in;
	}
	
	@GetMapping(value = "/prueba")
	public String prueba() {
		return in.calculateVersion();
	}
		

	

}
