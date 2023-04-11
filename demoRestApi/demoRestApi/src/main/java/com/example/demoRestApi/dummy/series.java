package com.example.demoRestApi.dummy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class series {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private int released_year;
	private String genre;
	
	
	public series() {
		
	}


	public series(int id, String title, int released_year, String genre) {
		this.title = title;
		this.released_year = released_year;
		this.genre = genre;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getReleased_year() {
		return released_year;
	}


	public void setReleased_year(int released_year) {
		this.released_year = released_year;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	

}
