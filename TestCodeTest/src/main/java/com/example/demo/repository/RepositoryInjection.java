package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.InjectionBean;

@Repository
public class RepositoryInjection {

	@Autowired
	InjectionBean p;	
	
	
	private RepositoryInjection() {
		
	}
	
	public String getValue() {
		
		p.setPass(6);
		p.setVersion(5);
		return p.toString();
				
		
		
	}
}
