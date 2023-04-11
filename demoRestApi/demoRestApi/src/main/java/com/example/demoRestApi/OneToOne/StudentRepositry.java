package com.example.demoRestApi.OneToOne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepositry extends JpaRepository<Student, Integer> {

}
