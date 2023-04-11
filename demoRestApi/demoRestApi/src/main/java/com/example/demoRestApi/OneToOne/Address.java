package com.example.demoRestApi.OneToOne;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Component
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int add_id;
	private String gali_no;
	private String street_no;
	private String pincode;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "address")
	@JsonBackReference
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Address() {

	}

	public Address(String gali_no, String street_no, String pincode) {

		this.gali_no = gali_no;
		this.street_no = street_no;
		this.pincode = pincode;
	}

	public int getAdd_id() {
		return add_id;
	}

	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}

	public String getGali_no() {
		return gali_no;
	}

	public void setGali_no(String gali_no) {
		this.gali_no = gali_no;
	}

	public String getStreet_no() {
		return street_no;
	}

	public void setStreet_no(String street_no) {
		this.street_no = street_no;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
