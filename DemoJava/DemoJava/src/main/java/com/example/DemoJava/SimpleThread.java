package com.example.DemoJava;

import java.util.ArrayList;


public class SimpleThread  extends Thread{

	public void run() {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(34);
		al.add(54);
		al.add(98);
		al.add(9);
		
		for (Integer integer : al) {
			
			System.out.println("This is Thread Based Integer Values::"+integer);
			
			
			
		}
		
		
		System.out.println("this is thread based class");
	}
	
	
	public int getcal(int a,int b)
	{
		int c = a+b;
		return c;
	}
}
