package com.example.demoRestApi.democurd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoRestApi.DataJPA.reviewers;



@RestController
@RequestMapping("/hey")
public class CurrentControler {

	@Autowired
	demoreviewerrepo demoreviewerrepo;

	@GetMapping("/hi")
	public List<reviewers> getdata() {
		return demoreviewerrepo.findAll();

	}

	// This is not working because table have foreign key
	/*
	 * @GetMapping("/del/{id}") public void del(@PathVariable String id) {
	 * reviewrepositry.deleteById(id); }
	 */

	/*
	 * @GetMapping("/delet/{id}") public void deleteid(@PathVariable String id) {
	 * reviewrepositry.deleteById(id); }
	 */
	
	
	@PutMapping("/update")
	public void update(@RequestBody reviewers reviewers) {
		demoreviewerrepo.save(reviewers);
	}

	@PostMapping("/save")
	public void saveorupdate(@RequestBody reviewers reviewers) {
		demoreviewerrepo.save(reviewers);
	}

}
