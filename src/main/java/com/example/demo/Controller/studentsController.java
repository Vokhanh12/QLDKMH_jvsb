package com.example.demo.Controller;

import com.example.demo.Entity.StudentEnity;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/submit-form")
public class studentsController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("")
    public void handleSubmitForm(@RequestBody StudentEnity studentEntity, Model model) {
        // code to save student to database

        // lưu studentEntity vào cơ sở dữ liệu
        studentRepository.save(studentEntity);


    }
}

