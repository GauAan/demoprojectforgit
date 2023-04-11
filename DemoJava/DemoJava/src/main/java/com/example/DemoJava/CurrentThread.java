package com.example.DemoJava;

public class CurrentThread extends Thread {

	int total = 0;

	public void run() {

		synchronized (this) {
			for (int i = 0; i < 1500; i++) {
				System.out.println(i);
				total = total + i;
			}
			
				this.notify();
				
			

		}
	}
}
