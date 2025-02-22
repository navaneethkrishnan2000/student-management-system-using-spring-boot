package com.education.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.student.entity.Student;
import com.education.student.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	public void addStudent(Student student) {
		
		studentRepository.save(student);
	}
	
	
	public List<Student> viewStudent() {
		return studentRepository.findAll();
	}
	
	public Student editStudent(int id){
		Optional<Student> e = studentRepository.findById(id);
		if (e.isPresent()) {
			return e.get();
		}
		return null;
	}
	
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}
	
}
