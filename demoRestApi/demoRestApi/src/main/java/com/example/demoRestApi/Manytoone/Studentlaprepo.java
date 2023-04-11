package com.example.demoRestApi.Manytoone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentlaprepo extends JpaRepository<Studentlap, Integer> {

}
