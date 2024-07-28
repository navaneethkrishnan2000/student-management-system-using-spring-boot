package com.education.student.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_table")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private  int id;
	
	@Column
	private String fullName;
	
	@Column
	private String rollNumber;
	
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;
	
	@Column
	private String department;
	
	@Column
	private String year;
	
	@Column
	//@NotNull(message="Empty Field !")
	private String address;
	
	@Column
	private String email;
	
	@Column
	private String phoneNumber;

//Constructor	
	public Student() {
		super();
	}
	
	public Student(int id, String fullName, String rollNumber, Date dateOfBirth, String department, String year,
			String address, String email, String phoneNumber) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.rollNumber = rollNumber;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
		this.year = year;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
