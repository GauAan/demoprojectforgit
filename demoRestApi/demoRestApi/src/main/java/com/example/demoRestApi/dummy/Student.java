package com.example.demoRestApi.dummy;


import org.springframework.stereotype.Component;
@Component
public class Student {
	
	private String name;
	private String lastname;
	private int id;
	private String status;
	private Address address;
	
	
	public Student() {
		
	}

	public Student(String name, String lastname, int id, String status, Address address) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.id = id;
		this.status = status;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

}
