package com.example.DemoJava;

public class Mythread implements Runnable{

	@Override
	public void run() {
		
		
		int[] a = {12,23,545,78,32,32};
		
		for (int i : a) {
			
			System.out.println(i);
			Thread.yield();
		}
		
	}
	
	
	

}
