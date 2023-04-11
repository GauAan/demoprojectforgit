package com.example.DemoJava;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Hashtable;


public class HashTableClass {

	public static void main(String[] args) {
		

		Hashtable<Object, String> t = new Hashtable<Object, String>();		

		t.put(3, "nitya singh");
		t.put(new data(2), "nitya singh");
		t.put(new data(31), "Lala Singh");
		t.put(new data(10), "Servesh Kumar");
		t.put(new data(5), "Gaurav Kumar");
		System.out.println(t);
		System.out.println(t.keySet());
		System.out.println(t.get(31));
	  
	}

}

class data implements Serializable{
	
	int i;
	
	data(int i)
	{
		this.i=i;
	}
	
	
	public int hashcode()
	{
		return i;
	}
	
	public String toString()
	{
		return i+"";
	}


	
}
