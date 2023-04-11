package com.example.DemoJava;

import java.util.Comparator;
import java.util.TreeSet;

public class TestDemo {

	public static void main(String[] args) {
		
   
		TreeSet ts= new TreeSet(new MyClass());
		ts.add("EGHSD");
		ts.add("ASDAASD");
		ts.add("ZSAS");
		ts.add("SAS");
		ts.add("QA");
		ts.add("H");
		ts.add("SAASS");
		System.out.println(ts);
		
		
		/*
		 * TreeSet<Integer> t = new TreeSet<>(new MyClass() ); t.add(12); t.add(17);
		 * t.add(98); t.add(90); t.add(22);
		 * 
		 * System.out.println(t);
		 */
		
		
		/*
		 * TreeSet<String> ts = new TreeSet<String>(new MyClass()); ts.add("Gaurav");
		 * ts.add("Abhishek"); ts.add("Lala Singh"); ts.add("Rishabh Singh");
		 * ts.add("Akash Kumar");
		 * 
		 * 
		 * System.out.println(ts);
		 */
		
		
	
		
		
	}
	

}


  class MyClass implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		String i1=o1.toString();
		String i2=o2.toString();
		Integer l1=i1.length();
		Integer l2 = i2.length();
		
		if(l1<l2)
		{
			return -1;
		}
		else if(l1>l2)
		{
			return +1;
		}
		else {
			return i1.compareTo(i2);
		}
		
		
		
		//return i2.compareTo(i1);
		//return i2.compareTo(i1);
		//Descending order
		//return i2.compareTo(i2);
		//Asdecnding Order
	}
	 
 }
