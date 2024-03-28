package com.example.demo.abstracts;

public class TestPolimorfismo {

	public static void main(String[] args) {
		
		
		Figura f = new Circulo("amarillo", 12);
		
		System.out.println("circulo " +f.area());
		
		
		f = new Triangulo("verde", 5, 6);
		
		System.out.println("triangulo " + f.area());
		

	}

}
