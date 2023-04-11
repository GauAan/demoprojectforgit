package com.example.demoRestApi.Manytoone;

import java.util.List;

public interface stuservice {

	
	List<Studentlap> stulist ();
	List<Laptop> laplist ();
	
	void studentlap(Studentlap studentlap);
	
}
