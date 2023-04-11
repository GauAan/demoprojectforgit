package com.example.demoRestApi.DataJPA;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface DataService {
	ArrayList<reviewers> findalldata();

	Optional<reviewers> finddatabyid(int id);

	void savedata(reviewers reviewers);
	List<reviewers> fetchdatabylist();
	List<reviewers> findAllActiveUsersNative();
	List<reviewers> findAllActiveUsersNativewhereclause(String name);
	

}
