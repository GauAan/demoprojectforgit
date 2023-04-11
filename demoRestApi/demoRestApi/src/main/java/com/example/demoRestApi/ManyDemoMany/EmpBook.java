package com.example.demoRestApi.ManyDemoMany;

import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class EmpBook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String EmpName;
	private String EmpStatus;
	private String EmpDate;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)

	 /*
	 * @JoinTable(name = "Studentbookmany", joinColumns = {
	 * 
	 * @JoinColumn(name = "Stu_Book_Id", referencedColumnName = "id") },
	 * inverseJoinColumns = {
	 * 
	 * @JoinColumn(name = "Book_id", referencedColumnName = "Bookid") }
	 * 
	 * )
	 */
	
	private List<Book> books;

	public EmpBook(String empName, String empStatus, String empDate, List<Book> books) {
		super();
		EmpName = empName;
		EmpStatus = empStatus;
		EmpDate = empDate;
		this.books = books;
	}

	public EmpBook() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpStatus() {
		return EmpStatus;
	}

	public void setEmpStatus(String empStatus) {
		EmpStatus = empStatus;
	}

	public String getEmpDate() {
		return EmpDate;
	}

	public void setEmpDate(String empDate) {
		EmpDate = empDate;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
