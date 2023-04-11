package com.example.DemoJava;

public class DummyClass {

	public String toString() {
		return "DummyClass";
	}
	
	public void finalize()
	{
		System.out.println("Finalized Method Call");
	}
	
	
}
