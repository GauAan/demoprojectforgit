package com.example.demoRestApi.DataJPA;


import java.util.List;
import java.util.Optional;


import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DataJpaController {

	@Autowired
	DataServiceImpl dataServiceImpl;
	
	
	@GetMapping("/all")
	public List<reviewers> getdata() {
		return dataServiceImpl.findalldata();
		
		 
	}

	@GetMapping("da/{id}")
	public Optional<reviewers> getdatabyid(@PathVariable int id) {
		return dataServiceImpl.finddatabyid(id);
	}

	@PostMapping("/savada")
	public void savdata(@RequestBody reviewers reviewers) {
		dataServiceImpl.savedata(reviewers);
	}

	/*
	 * @GetMapping("/ha") public List<reviewers> getname() { List<reviewers>
	 * gg=dataServiceImpl.dataRepositry.findAllActiveUsersNative();
	 * 
	 * return gg; }
	 */

	@GetMapping("/getdatabylist")
	public List<reviewers> datalist(){
		
		
		return ((DataServiceImpl) dataServiceImpl).fetchdatabylist();
	}
	
	@GetMapping("/lala")
	public List<reviewers> Getdata()
	{
		return dataServiceImpl.findAllActiveUsersNative();
	}
	
	
	@GetMapping("/la/{name}")
	public List<reviewers> Getdatawhereclause(@PathVariable ("name") String  name)
	{
		return dataServiceImpl.findAllActiveUsersNativewhereclause(name);
	}
	
}
