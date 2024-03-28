package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.bean.InjectionBean;
import com.example.demo.repository.RepositoryInjection;

@Service
public class ServiceInjection {		

	
	private RepositoryInjection tib;
	
	
	public ServiceInjection(RepositoryInjection tib) {			
		this.tib = tib;
	}
	

	
	public String calculateVersion() {		
		return tib.getValue();
	}
	
	


}
