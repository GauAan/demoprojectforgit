package com.example.demoRestApi.OneToOne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Control")
public class OneToOneController {
	
	@Autowired
	OneServiceImpl oneServiceImpl;

	@Autowired
	AddressRepo addressRepo;
	

	@GetMapping("/one")
	public String getDetails() {
		
		return "Kumar Gaurav";
	}

	@GetMapping("/onetoone")
	public List<Student> getDetailsdata(Student stu) {
		List<Student> st = oneServiceImpl.getAlldata(stu);
		return st;
	}

	@PostMapping("/save")
	public void savedata(@RequestBody Student stu) {
		oneServiceImpl.add(stu);
	}

	@GetMapping("/adddata")
	public List<Address> getallAddressdetails() {
		List<Address> addre = addressRepo.findAll();
		/*
		 * for (Address addr : addre) { System.out.println(addr.toString()); }
		 */

		return addre;
	}

}
