package com.example.DemoJava.MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

interface interf {
	
	public void m1(String name);

	
	
}

interface interf2{
	
	
	public Simple get(int a,int b);
}

class Simple
{
	
	Simple(int a,int b)
	{
		System.out.println("this is constructor::"+(a+b));
	}
	
	public Simple() {
		
	}

	public void m1(String name) {
		System.out.println("this is mehod reference::"+name);
	}
	public static void m3(String name)
	{
		System.out.println("this is static method::"+name);
	}
	
	
}

public class MainClass   {
	
	public static void m2(Integer a)
	{
		System.out.println("this is main thing::"+a);
	}

	public static void main(String[] args) {
		
		
		interf interf1 = Simple::m3;
	    interf1.m1("Gaurav");
		
	    Simple simple =new Simple();
		interf interf2 = simple::m1;
		interf2.m1("nON-Static Method");
		
		
		interf2 interf22 = Simple::new;
		interf22.get(12,12);
		
		int[] intArray = new int[7];
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(12);
		arrayList.add(13);
		arrayList.add(10);
		arrayList.add(9);
		arrayList.add(5);
		arrayList.add(2);
		
		System.out.println(arrayList);
		
	List<Integer> l2=arrayList.stream().filter(i->i%2==0).map(i->i*3+5).collect(Collectors.toList());
	System.out.println(l2);
			
	}

}
