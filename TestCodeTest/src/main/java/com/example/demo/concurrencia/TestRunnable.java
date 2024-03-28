package com.example.demo.concurrencia;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class TestRunnable implements Runnable{

	@Override
	public void run() {
		int randomNum = ThreadLocalRandom.current().nextInt(2000, 5000);
		System.out.println("hola soy un hilo de Runnable"+ LocalDateTime.now());
		
		
		System.out.println(randomNum);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("adios soy un hilo de Runnable" + LocalDateTime.now());
	}

}
