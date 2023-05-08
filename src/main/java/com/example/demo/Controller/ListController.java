package com.example.demo.Controller;

import com.example.demo.Entity.StudentEnity;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ListController {

    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/listsv")
    public String getListSV(Model model) {
        // Do something
        List<StudentEnity> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "listsv";
    }



    @PostMapping("/listgv")
    public String getListGV(Model model) {
        // Do something
        return "listgv";
    }




}
