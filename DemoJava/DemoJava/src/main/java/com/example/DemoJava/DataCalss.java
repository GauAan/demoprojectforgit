package com.example.DemoJava;

public class DataCalss implements Comparable<Object>{

	int i=0;
	String name="";
	
	DataCalss(int i,String name){
		
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
	public int compareTo(Object o) {
	
		int i1= this.i;
		
		DataCalss dc=(DataCalss)o;
		int i2=dc.i;
		
		if(i1<i2)
		{
			return +1;
		}
		else if(i1>i2)
		{
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
	
	
}
