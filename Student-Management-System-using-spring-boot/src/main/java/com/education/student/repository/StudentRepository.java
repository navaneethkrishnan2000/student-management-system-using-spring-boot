package com.education.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.student.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findByEmailAndRollNumber(String email, String rollNumber);

}
