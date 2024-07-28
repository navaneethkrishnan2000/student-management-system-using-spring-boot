package com.education.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.education.student.entity.Student;
import com.education.student.service.StudentService;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/register")
	public String studentregister( @ModelAttribute Student student ,HttpSession session) {
		    
		studentService.addStudent(student);
		session.setAttribute("message", "New Student Added Successfully");
		return "redirect:/viewStudent";
	}
	
	@GetMapping("/addStudent")
	public String addStudentPage() {
		return "addStudent";
	}
	
	@GetMapping("/editStudent/addStudent")
	public String editAddStudentPage() {
		return "addStudent"; // name of html page
	}

	@GetMapping("/viewStudent")
	public String viewStudentPage(Model model ) {
		List<Student> students= studentService.viewStudent();
		model.addAttribute("students",students);
		return "viewStudent"; // name of html page
	}
	@GetMapping("/editStudent/viewStudent")
	public String editeditstudentViewstudentiewStudentPage(Model model ) {
		List<Student> students= studentService.viewStudent();
		model.addAttribute("students",students);
		return "viewStudent";
	}
	
	@GetMapping("/editStudent/{id}")
	public String edit(@PathVariable int id,Model model) {
		Student students = studentService.editStudent(id);
		model.addAttribute("students",students);
		return "editStudent"; // name of html page
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Student student, Model model, HttpSession session) {
		studentService.addStudent(student);
		session.setAttribute("message", "Successfully Updated !");

		return "redirect:/viewStudent";
		
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, HttpSession session) {
		studentService.deleteStudent(id);
		session.setAttribute("message", "Successfully Deleted !");
		return "redirect:/viewStudent";
	}
	
}

