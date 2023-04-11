package com.example.demoRestApi.Manytoone;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Component
@Entity
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String modelnumber;
	private String generation;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "stu_id_new")
	@JsonBackReference
	private Studentlap studentlap;

	public Studentlap getStudentlap() {
		return studentlap;
	}

	public void setStudentlap(Studentlap studentlap) {
		this.studentlap = studentlap;
	}

	public Laptop() {

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

	public String getModelnumber() {
		return modelnumber;
	}

	public void setModelnumber(String modelnumber) {
		this.modelnumber = modelnumber;
	}

	public String getGeneration() {
		return generation;
	}

	public void setGeneration(String generation) {
		this.generation = generation;
	}

	public void m1()
	{
		System.out.println("this is hello");
	}
	
}
