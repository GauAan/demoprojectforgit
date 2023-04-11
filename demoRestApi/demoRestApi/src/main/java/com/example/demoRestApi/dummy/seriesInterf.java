package com.example.demoRestApi.dummy;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface seriesInterf extends JpaRepository<series, Integer> {

	
}
