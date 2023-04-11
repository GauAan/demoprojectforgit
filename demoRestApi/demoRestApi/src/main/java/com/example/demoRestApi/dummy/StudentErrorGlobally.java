package com.example.demoRestApi.dummy;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentErrorGlobally {


	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> GetErrorResponse(StudentNotFoundException exc) {
		StudentErrorResponse error = new StudentErrorResponse();

		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMsg(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<StudentErrorResponse>(error, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> GetErrorResponse(Exception exc) {

		StudentErrorResponse error1 = new StudentErrorResponse();
		error1.setStatus(HttpStatus.BAD_REQUEST.value());
		error1.setMsg(exc.getMessage());
		error1.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<StudentErrorResponse>(error1, HttpStatus.BAD_REQUEST);

	}
	
	
	
}
