package com.example.demo.enumeraciones;

public class PruebaEnum {

	public static void main(String[] args) {
		
		Dias diaSemana = Dias.JUEVES;
		
		System.out.println(diaSemana.name());
		
		 if (diaSemana == Dias.LUNES) {
			System.out.println("es lunes");
		}else if(diaSemana == Dias.MARTES) {
			System.out.println("es martes");
		}else {
			System.out.println("no inviertas este dia");
		}
		 
		 
		 switch (diaSemana) {
		case LUNES: {
			
			System.out.println("es lunes");
		}
		case MARTES: {
			System.out.println("es martes");
		}
		default:
			//throw new IllegalArgumentException("Unexpected value: " + diaSemana);
		}
		 
		 //prueba con los dias de la semana en ingles que tiene un constructor
		 
		 Days day = Days.FRIDAY;

		 System.out.println(day.name());
		 Days[] daysweek = day.values();
		 for (Days days : daysweek) {
			System.out.println(days.data);
		}
		 
		 

	}

}
