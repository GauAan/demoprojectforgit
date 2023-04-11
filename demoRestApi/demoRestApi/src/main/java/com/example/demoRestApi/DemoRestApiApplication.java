package com.example.demoRestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demoRestApi.dummy.EmployeInterf;
import com.example.demoRestApi.dummy.Employee;




@SpringBootApplication
public class DemoRestApiApplication  implements CommandLineRunner {

	@Autowired
	private EmployeInterf EmpInter;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoRestApiApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee EmpItem = new Employee();
		EmpItem.setItem("Gaurav mouse");
		EmpItem.setAmount(23.21f);
        

        // save product
        EmpInter.save(EmpItem);
		
	}
	
	
	
}


