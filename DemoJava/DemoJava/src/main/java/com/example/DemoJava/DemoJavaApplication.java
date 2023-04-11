package com.example.DemoJava;

import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJavaApplication {

	static int[] arg = { 12, 1, 22, 32, 44, 87, 90, 657 };

	public static void main(String[] args) {
		SpringApplication.run(DemoJavaApplication.class, args);
		

		Function<Integer, Integer> f = (i) -> {
			return (i * i);
		};
		System.out.println("this is square of :" + f.apply(2));
		System.out.println("this is square of :" + f.apply(25));

		Predicate<Integer> p = (i) -> i % 2 == 0;
		System.out.println(p.test(25));

		Predicate<Integer> fun = (i) -> {
			System.out.println(i * i);
			return false;

		};
		System.out.println(fun.test(12));

		Function<String, Integer> fg = (str) -> {
			return str.length();
		};
		System.out.println(fg.apply("Gauravsdfsd"));
		
		Predicate<Integer> pi =(n)->{
			System.out.println(n*n*n);
			return true;
		};
		System.out.println(pi.test(12));
		
		
		/*
		 * Interface fi = new a(); fi .m1(); fi .m2();
		 */
		
		Interface i = (a,b)->{
			System.out.println("this is product----"+(a*b));
			
					};
		i.m1(12, 12);
		
		i.m2();
		
		
		
		
	}

	


}
