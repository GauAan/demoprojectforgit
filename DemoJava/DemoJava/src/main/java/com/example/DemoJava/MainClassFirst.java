package com.example.DemoJava;

public class MainClassFirst {

	public static void main(String[] args) throws ArithmeticException  {

		/*String ab = "Gaurav";
		String s="";
		char ch;
		
		for(int i=0;i<ab.length();i++)
		{
			ch=ab.charAt(i);
			s=ch+s;
			
		}
		System.out.println(s);*/
		
		
		
		
		m1(5);
	
	}
	
	
	
	public static  void m1(int n)
	{
		if(n==0)
		return ; 
		
		
		System.out.println(n);
		m1(n-1);
		
	}
}
