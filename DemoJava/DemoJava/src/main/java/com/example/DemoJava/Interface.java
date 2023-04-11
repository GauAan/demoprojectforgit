package com.example.DemoJava;

@FunctionalInterface
public interface Interface {
	
	
	public void m1(int a,int b);
	
	default void m2()
	{
		System.out.println("this is m2 default");
	}
	
	public static void m3()
	{
	  System.out.println("this is m3 static mathod");	
	}

}
