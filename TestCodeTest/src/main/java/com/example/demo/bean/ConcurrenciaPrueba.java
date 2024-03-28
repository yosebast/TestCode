package com.example.demo.bean;



//la variable lock al no ser privada podria ser alterada desde fuera y asignar otro objeto ReentrantLock diferente y 
//se pueda usar con un hilo un objeto ReentrantLock diferente y con otro hilo el otro ¿explicame como seria posible esto?


import java.util.concurrent.locks.ReentrantLock;

public class ConcurrenciaPrueba {
	
	private String id;
	private double balance;
	
	ReentrantLock lock = new ReentrantLock();
	
	public void withdraw(double amt) {
		
		try {
			lock.lock();
			if (balance>amt) {
				balance = balance-amt;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			lock.unlock();
		}
	}


}
