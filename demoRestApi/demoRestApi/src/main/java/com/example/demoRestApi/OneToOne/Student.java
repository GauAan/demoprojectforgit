package com.example.demoRestApi.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String aadharcardno;
	private String pancardno;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	@JsonManagedReference
	private Address address;

	
	public Student() {
		
	}


	

	public Student(String name, String aadharcardno, String pancardno, Address address) {
		
		this.name = name;
		this.aadharcardno = aadharcardno;
		this.pancardno = pancardno;
		this.address = address;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAadharcardno() {
		return aadharcardno;
	}


	public void setAadharcardno(String aadharcardno) {
		this.aadharcardno = aadharcardno;
	}


	public String getPancardno() {
		return pancardno;
	}


	public void setPancardno(String pancardno) {
		this.pancardno = pancardno;
	}
	
	
	

}
