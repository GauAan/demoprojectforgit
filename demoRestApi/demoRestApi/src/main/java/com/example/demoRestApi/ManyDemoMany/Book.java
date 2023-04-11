package com.example.demoRestApi.ManyDemoMany;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Bookid;
	private String BookName;
	private String BookIssueDate;
	private String BookAuthor;
	
	@ManyToMany(mappedBy = "books",fetch = FetchType.LAZY)

	private List<EmpBook> empBooks;
	
	
	public Book() {
		
	}
	
	public Book(String bookName, String bookIssueDate, String bookAuthor) {
		super();
		BookName = bookName;
		BookIssueDate = bookIssueDate;
		BookAuthor = bookAuthor;
	}
	public int getBookid() {
		return Bookid;
	}
	public void setBookid(int bookid) {
		Bookid = bookid;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookIssueDate() {
		return BookIssueDate;
	}
	public void setBookIssueDate(String bookIssueDate) {
		BookIssueDate = bookIssueDate;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	
	public List<EmpBook> getEmpBooks() {
		return empBooks;
	}
	public void setEmpBooks(List<EmpBook> empBooks) {
		this.empBooks = empBooks;
	}
	
	
	
	
	
}
