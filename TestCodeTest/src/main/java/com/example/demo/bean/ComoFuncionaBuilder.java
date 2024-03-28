package com.example.demo.bean;

import lombok.Data;

@Data
public class ComoFuncionaBuilder {
	
	private final String name;	
	private final String dni;
	
	public ComoFuncionaBuilder(String name, String dni) {
		this.name = name;
		this.dni = dni;
	}
	
	public ComoFuncionaBuilder(Builder buil) {
		this.name = buil.name;
		this.dni = buil.dni;
	}
	
	static class Builder {
		
		private String name;
		private String dni;


		public ComoFuncionaBuilder.Builder setName(String name) {
			this.name = name;
			return this;
			
		}
		
		public ComoFuncionaBuilder.Builder setDni(String dni) {
			this.dni = dni;
			return this;
			
		}
		
				
		public ComoFuncionaBuilder build() {
			return new ComoFuncionaBuilder(this);
		}
		
		
		
	}


	
	

}
