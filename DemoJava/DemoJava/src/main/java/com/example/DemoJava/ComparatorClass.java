package com.example.DemoJava;

import java.util.Comparator;

public class ComparatorClass implements Comparator<ComparatorClass> {

	
	int i=0;
	String name="";
	
	ComparatorClass(int i,String name){
		
		this.i=i;
		this.name=name;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return i+"---"+name;
	}

	@Override
	public int compare(ComparatorClass o1, ComparatorClass o2) {
		
		String n1= o1.name;
		String n2= o2.name;
		
		return n2.compareTo(n1);
	}

	
	
	
	
	
}
