package com.example.demoRestApi.DataJPA;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DataServiceImpl implements DataService {
	
	@Autowired
	DataRepositry dataRepositry;
	

	@Override
	public ArrayList<reviewers> findalldata() {
		
		ArrayList<reviewers> al= (ArrayList<reviewers>) dataRepositry.findAll();
		ArrayList<reviewers> c=(ArrayList<reviewers>) al.stream().sorted(Comparator.comparingInt(reviewers::getId).reversed()).collect(Collectors.toList());

		return c;
	}

	@Override
	public Optional<reviewers> finddatabyid(int id) {
		
		return dataRepositry.findById(id);
	}

	@Override
	public void savedata(reviewers reviewers) {
		
		 dataRepositry.save(reviewers);
	}

	@Override
	public List<reviewers> fetchdatabylist() {
		
		return dataRepositry.findAll();
	}

	@Override
	public List<reviewers> findAllActiveUsersNative() {
		// TODO Auto-generated method stub
		return dataRepositry.findAllActiveUsersNative();
	}

	@Override
	public List<reviewers> findAllActiveUsersNativewhereclause(String name) {
		
		return dataRepositry.findAllActiveUsersNativewhereclause(name);
	}

	

	



}
