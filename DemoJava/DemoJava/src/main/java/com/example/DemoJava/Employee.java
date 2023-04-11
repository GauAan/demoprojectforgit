package com.example.DemoJava;

public class Employee {
	
	private String Name;
	private int age;
	
	
	@Override
	public String toString() {
		return  Name +  age ;
	}
	public Employee(String name, int age) {
	
		Name = name;
		this.age = age;
	}
	public Employee() {
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
