package com.education.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.education.student.entity.Student;
import com.education.student.service.StudentService;

@Controller
public class LoginController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "userLogin";
    }

    @PostMapping("/login")
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String rollNumber,
                        Model model) {
        Student student = studentService.findByFullNameAndRollNumber(email, rollNumber);
        if (student != null) {
            model.addAttribute("student", student);
            return "studentDetails"; // Page to show student details
        } else {
            model.addAttribute("error", "Invalid email or password");
            return "userLogin";
        }
    }
}
