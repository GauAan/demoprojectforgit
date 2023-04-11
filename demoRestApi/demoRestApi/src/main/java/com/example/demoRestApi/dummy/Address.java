package com.example.demoRestApi.dummy;

public class Address {

	private String City;
	private String street;
	private String country;
	private String zipcode;
	
	
	public Address() {
		
	}
	public Address(String city, String street, String country, String zipcode) {
		City = city;
		this.street = street;
		this.country = country;
		this.zipcode = zipcode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
	
	
}
