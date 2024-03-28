package com.example.demo.abstracts;

public abstract class Figura {
	
	private String color;
	
	public Figura(String color) {
		super();
		this.color = color;
	}
	
	public final int calculo() {
		return 0;}
		
	
	
	public abstract double area();

}
