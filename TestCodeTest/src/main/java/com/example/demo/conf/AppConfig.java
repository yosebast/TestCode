package com.example.demo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.bean.InjectionBean;

@Configuration
public class AppConfig {
	
	@Bean
	public InjectionBean injeBean() {		
		return new InjectionBean();
	}
	
	

}
