package com.example.DemoJava;

public class ThreadDemo extends Thread {
	
	MyThreadFirst myThreadFirst;
	String name;
	
	public ThreadDemo(MyThreadFirst myThreadFirst,String name){
		
		
		this.myThreadFirst=myThreadFirst;
		this.name=name;
	}
	
	
	public void run()
	{
		myThreadFirst.display(name);
	}
	
	
	public void getdata() {
		System.out.println("Normal method");
		synchronized (MyThreadFirst.class) {

			for (int i = 0; i < 5; i++) {
				System.out.println("synchronized method");
			}
		}
	}
	

}
