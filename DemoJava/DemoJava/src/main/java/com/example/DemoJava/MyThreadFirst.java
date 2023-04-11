package com.example.DemoJava;

public class MyThreadFirst extends Thread {

	static Thread mt;

	public void run() {

		/*
		 * try { mt.join(); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
			System.out.println("This is child bacha");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("This is interpt Thread");
		}

	}

	public static synchronized void display(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Good Morning::");

			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block

			}
			System.out.println(name);

		}

	}

	

	public synchronized void getdatata() {
		System.out.println("get data synchronized method");
	}
}
