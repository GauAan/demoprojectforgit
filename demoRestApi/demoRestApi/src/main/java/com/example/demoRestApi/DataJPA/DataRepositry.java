package com.example.demoRestApi.DataJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface DataRepositry extends JpaRepository<reviewers, Integer> {

	@Query(value = "SELECT * FROM reviewers inner join reviews on reviewers.id = reviews.Reviewers_id", nativeQuery = true)
	List<reviewers> findAllActiveUsersNative();
	
	@Query(value = "SELECT * FROM reviewers where first_name=:n", nativeQuery = true)
	List<reviewers> findAllActiveUsersNativewhereclause(@Param ("n") String name);
	
	/*
	 * @Query(value =
	 * "SELECT * FROM reviewers inner join reviews on reviewers.id = reviews.Reviewers_id"
	 * , nativeQuery = true) List<reviewers> findAllActiveUsersNative1();
	 */

	//@Query(value = "SELECT * FROM reviewers where first_name='nitya'", nativeQuery = true)
}
