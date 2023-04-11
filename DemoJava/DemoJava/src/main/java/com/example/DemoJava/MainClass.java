package com.example.DemoJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainClass implements interf1 {

	public static void main(String[] args) {

		Simple simple = new Simple();
		simple.setName_simple("Gaurav Kumar");
		simple.setEmail_simple("infokumargaurav77@gmail.com");
		System.out.println(simple.getName_simple());
		System.out.println(simple.getEmail_simple());

		Function<Integer, Integer> fn = (e) -> {
			System.out.println("this is hello" + (e + e));
			return 0;
		};

		fn.apply(2);

		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}

		};

		Thread thread = new Thread(runnable);
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(12);
		arraylist.add(23);
		arraylist.add(24);
		arraylist.add(98);
		arraylist.add(67);
		System.out.println(arraylist);

		Comparator<Integer> c = (e1, e2) -> (e1 < e2) ? 1 : (e1 > e2) ? -1 : 0;

		Collections.sort(arraylist, c);
		System.out.println(arraylist);

		ArrayList<Employee> ar1 = new ArrayList<>();
		ar1.add(new Employee("Gaurav", 12));
		ar1.add(new Employee("abhishek", 23));
		ar1.add(new Employee("neta", 78));
		ar1.add(new Employee("Chalu", 56));
		ar1.add(new Employee("Beta", 34));
		ar1.add(new Employee("Zebra", 23));

		System.out.println("this is thing is good");

		// Collections.sort(ar,(e1,e2)->e1.getName().compareTo(e2.getName()));

		// Collections.sort(ar,(e1,e2)->(e1.getAge()<e2.getAge())?1:(e1.getAge()>e2.
		// getAge())?-1:0 ); //System.out.println(ar);

		Runnable runnable2 = () -> {

			for (int i = 0; i < 10; i++) {
				System.out.println("thread");
			}

		};

		Thread thread2 = new Thread(runnable2);
		thread2.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("THread2");
		}

		lalaclass abc = new lalaclass();
		abc.m1();

		String name = interf1.m2();
		System.out.println("baba" + name);
		interf1.m3();
		interf1.m4();
		interf1.m5();

		MainClass class1 = new MainClass();
		class1.m1();
		class1.m22();
		class1.m33();

		Function<Integer, Integer> function = (a) -> {
			int b = a * a;
			System.out.println(b);
			return b;
		};

		function.apply(156);

		Predicate<Integer> predicate = (i) -> i % 3 == 0;

		System.out.println(predicate.test(12));

		Employee t1 = new Employee("Gaurav", 13);
		Predicate<Employee> predicate2 = (e) -> e.getAge() < 12;
		System.out.println(predicate2.test(t1));

		Predicate<Employee> predicate3 = (e) -> e.getName().length() == 6;
		System.out.println(predicate3.test(t1));

		////////////////////

		String[] str = { "Gaurav", "dhruv", "neta", "dev", "lala", "manish" };

		Predicate<String> predicate4 = s1 -> s1.length() > 4;
		for (String s1 : str) {

			if (predicate4.test(s1)) {
				List<String> list = new ArrayList<>();
				list.add(s1);
				System.out.println(list);

			} else {

			}

		}

		List<Employee> l = new ArrayList<>();
		l.add(new Employee("Gaurav", 20));
		l.add(new Employee("Akash", 23));
		l.add(new Employee("netaji", 25));
		l.add(new Employee("nitya", 19));

		Predicate<Employee> predicate5 = e -> e.getAge() > 19;

		for (Employee emp : l) {

			if (predicate5.test(emp)) {
				System.out.println(emp);
			}

		}

		/*
		 * int[] arg = {12,23,2,34,65,76,34,98,90}; Predicate<Integer> predicate6
		 * =i->i%2==0; //Predicate<Integer> predicate7 =i->i>10; for (int x : arg) {
		 * if(predicate6.negate().test(x)) { System.out.println(x); }
		 * 
		 * }
		 */

		Mythread myth = new Mythread();

		Thread thad = new Thread(myth);
		thad.start();
		

		String[] st = { "gaurav", "akash", "this", "nitya" };

		for (String strt : st) {
			System.out.println("Main class thread::" + strt);
		}

		SimpleThread simpleThread = new SimpleThread();
		
		simpleThread.start();
		
		for(int i=0;i<=10;i++)
		{
			
			System.out.println("this is main thread"+i);
			
			
		}
		
		//System.out.println(simpleThread.getcal(1200, 1200));

		Runnable runnable3 = () -> {

			int[] ab = { 12, 23, 43, 65, 98, 23 };

			for (int it : ab) {

				System.out.println("Child class thread::" + it);

			}

		};
		Thread thread3 = new Thread(runnable3);
		thread3.run();
		System.out.println(thread3.getPriority());

		String[] stt = { "gaurav", "akash", "this", "nitya" };

		for (String string : stt) {
			System.out.println("Main  child class thread::" + string);
		}

		
		
		System.out.println(Thread.currentThread());
		
		Thread.currentThread().setName("Gaurav_Main");
		System.out.println(Thread.currentThread());
		
		
		
		
	}

}
