package com.example.demoRestApi.democurd;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demoRestApi.DataJPA.reviewers;


@Repository
public interface demoreviewerrepo extends JpaRepository<reviewers, Integer> {

}
