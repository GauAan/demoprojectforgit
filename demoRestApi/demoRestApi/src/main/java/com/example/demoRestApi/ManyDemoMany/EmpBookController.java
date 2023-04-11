package com.example.demoRestApi.ManyDemoMany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/EmpBookCon")
public class EmpBookController {
	
	@Autowired
	EmpBookRepo empBookRepo;
	
	@Autowired
	BookRepo bookRepo;
	
	
	@GetMapping("/Name")
	public List<EmpBook>  getName()
	{
		return empBookRepo.findAll();
	}
	
	@GetMapping("/namebook")
	public List<Book>  getBookName()
	{
		return bookRepo.findAll();
	}
	
	
	

	@PostMapping("/datapost")
	public String getpostdata(@RequestBody EmpBook empBook)
	{
		empBookRepo.save(empBook);
		return"Successfully";
	}
	
	
	@GetMapping("/deletedata/{id}")
	public String getpostdata(@PathVariable int id)
	{
		empBookRepo.deleteById(id);
		return" Delete Successfully";
	}
	
	
	@GetMapping("/NameBook")
	public List<Book>  getda()
	{
		return bookRepo.findAll();
	}

}
