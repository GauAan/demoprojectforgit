package com.example.demoRestApi.Manytoone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Stuseriviceimpl implements stuservice {

	@Autowired
	Studentlaprepo studentlaprepo;
	
	@Autowired
	laptoprepo laptoprepo;
	
	
	
	
	@Override
	public List<Studentlap> stulist() {
		
		return studentlaprepo.findAll();
	}

	@Override
	public void studentlap(Studentlap studentlap) {
		
		studentlaprepo.save(studentlap);
		
		
	}

	@Override
	public List<Laptop> laplist() {
		
		return laptoprepo.findAll();
		}

	

}
