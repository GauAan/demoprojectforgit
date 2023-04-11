package com.example.DemoJava;



import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.WeakHashMap;

import org.springframework.util.comparator.ComparableComparator;




public class EmployeeMain {

	public static void main(String[] args) {
		
		
		DataCalss e1 = new DataCalss(1, "Gaurav");
		DataCalss e2 = new DataCalss(2, "Nitya");
		DataCalss e3 = new DataCalss(3, "Akash");
		DataCalss e4 = new DataCalss(4, "Dada");
		DataCalss e5 = new DataCalss(2, "Lala");
		DataCalss e6 = new DataCalss(5, "Netaji");
		
		
		
		TreeSet<DataCalss> t = new TreeSet<DataCalss>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		
		//System.out.println(t);
		
		ComparatorClass e11 = new ComparatorClass(1, "Gaurav Kumar");
		ComparatorClass e22 = new ComparatorClass(2, "Nitya Singh");
		ComparatorClass e33 = new ComparatorClass(3, "Akash Cha");
		ComparatorClass e44 = new ComparatorClass(4, "Dada Lala");
		ComparatorClass e55 = new ComparatorClass(2, "Lala chutita");
		ComparatorClass e66 = new ComparatorClass(5, "Netaji gandu");
		
		ComparatorClass  c= new ComparatorClass(1, "Gaurav lala");
		
		TreeSet<ComparatorClass> tc = new TreeSet<ComparatorClass>(c);
		tc.add(e11);
		tc.add(e22);
		tc.add(e33);
		tc.add(e44);
		tc.add(e55);
		tc.add(e66);
		
		System.out.println(tc);
		
		HashMap m = new HashMap();
		m.put(1, "Gaurav");
		m.put(2, "Kumar");
		m.put(3, "Lala");
		m.put(6, "Neta ji");
		m.put(6, "Neta ");
		
		
		System.out.println(m);
		System.out.println(m.remove(1));
		System.out.println(m);
		System.out.println(m.containsKey(2));
		System.out.println(m.containsValue("Kumar"));
		System.out.println(m.isEmpty());
		System.out.println(m.size());
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		
		
	   
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.putAll(m);
		System.out.println("HashMap::"+hm);
		
		 Iterator<Map.Entry<Integer,String>> me = hm.entrySet().iterator();
	        while(me.hasNext())
	        {   
	            Map.Entry<Integer,String> entry = me.next();
	            Integer key = entry.getKey();
	            String value = entry.getValue();
	            System.out.println("key:- "+key+" value:- "+value);
	            
	            if(entry.getKey().equals(2)) {
	            	entry.setValue("1999999");
	            }
	          
	            
	            
	        }
	        System.out.println(hm);


	      IdentityHashMap m12 = new IdentityHashMap();
	      
	      Integer i1 = new Integer(10);
	      Integer i2 = new Integer(12);
	      
	      Integer i3 = new Integer(10);
	      
	      if(i1.equals(i2))
	      {
	    	  System.out.println("true");
	      }
	      else
	      {
	    	  System.out.println("False");
	      }
	      
	      m12.put(i1, "GAURAV");
	      m12.put(i2, "Kumar");
	      m12.put(i3, "gaurav kumar");
	      System.out.println(m12);
	      
	      
	      
	      
	      WeakHashMap ms = new WeakHashMap();
	      
	      DummyClass dc = new DummyClass();
	      ms.put(dc, "Gaurav");
	      
	      System.out.println(ms);
	      dc=null;
	      System.gc();
	      try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      System.out.println(ms);
	        
	        
	        
	        
	}

}

