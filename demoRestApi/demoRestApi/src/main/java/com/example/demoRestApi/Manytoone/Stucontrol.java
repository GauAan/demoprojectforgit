package com.example.demoRestApi.Manytoone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stu")
public class Stucontrol {
	@Autowired
	Stuseriviceimpl stuseriviceimpl;

	@Autowired
	Laptop laptop;

	@GetMapping("/data")
	public List<Studentlap> getalldata() {
		return stuseriviceimpl.stulist();
	}

	@GetMapping("/demo")
	public String getafgdg() {
		System.out.println("--------------");
		laptop.m1();
		return "this";
	}

	@PostMapping("/savdata")
	public void savedata(@RequestBody Studentlap studentlap) {
		stuseriviceimpl.studentlap(studentlap);
	}

	@GetMapping("/lapdata")
	public List<Laptop> getAlldatastulap() {
		return stuseriviceimpl.laplist();
	}

}
