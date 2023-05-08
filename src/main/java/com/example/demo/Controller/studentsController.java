package com.example.demo.Controller;

import com.example.demo.Entity.StudentEnity;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class studentsController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/submit-form")
    public String showRegistrationForm(Model model) {
        model.addAttribute("student", new StudentEnity());
        return "login";
    }

    @PostMapping("/submit-form")
    public String registerUser(@ModelAttribute("student") StudentEnity studentEnity) {
        studentRepository.save(studentEnity);
        return "redirect:/login";
    }

}

