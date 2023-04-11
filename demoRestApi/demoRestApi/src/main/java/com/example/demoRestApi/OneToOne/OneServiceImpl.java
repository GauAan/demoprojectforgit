package com.example.demoRestApi.OneToOne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OneServiceImpl implements OneService {

	@Autowired
	StudentRepositry studentRepositry;
	

	@Override
	public List<Student> getAlldata(Student student) {

		return studentRepositry.findAll();
	}

	@Override
	public void add(Student student) {
		studentRepositry.save(student);
}
	/*
	 * public Student StuinfotoStu(StudentInfo studentInfo) { Student student = new
	 * Student();
	 * 
	 * student.setId(studentInfo.getId()); student.setName(studentInfo.getName());
	 * student.setAadharcardno(studentInfo.getAadharcardno());
	 * 
	 * return student;
	 * 
	 * }
	 * 
	 * public StudentInfo stuinfotostu(Student student) { StudentInfo studentInfo =
	 * new StudentInfo();
	 * 
	 * studentInfo.setId(student.getId()); studentInfo.setName(student.getName());
	 * studentInfo.setAadharcardno(student.getAadharcardno());
	 * 
	 * return studentInfo;
	 * 
	 * }
	 */

	

}
