package com.example.demo.concurrencia;

public class DemoThread {

	public static void main(String[] args) {
	
		TestThread t = new TestThread();
		t.start();
		
		
		TestRunnable tr = new TestRunnable();
		Thread r = new Thread(tr);
		r.start();
	}

}
