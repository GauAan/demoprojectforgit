package com.example.DemoJava;

public interface interf1 {

	default void m1()
	{
		System.out.println(" default m1");
	}
	
	default void m22()
	{
		System.out.println(" default m2");
	}
	
	default void m33()
	{
		System.out.println(" default m3");
	}
	
	
	public static String m2() {
		return"this is static method m2";
	}
	public static void m3() {
		System.out.println("this is static method m3");
	}
	public static void m4() {
		System.out.println("this is static method m4");
	}
	public static void m5() {
		System.out.println("this is static method m5");
	}
	
	
	
}
