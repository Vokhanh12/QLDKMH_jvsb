package com.example.demo.Controller;

import com.example.demo.Entity.CourseRegistrationEntity;
import com.example.demo.Entity.CourseTeachEntity;
import com.example.demo.Entity.StudentEntity;
import com.example.demo.Entity.TeacherEntity;
import com.example.demo.Repository.CourseRegistrationRepository;
import com.example.demo.Repository.CourseTeachRepository;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Repository.TeacherRepository;
import com.example.demo.Service.CourseRegistrationService;
import com.example.demo.Service.CourseTeachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ListController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private CourseRegistrationRepository courseRegistrationRepository;

    @Autowired
    private CourseTeachRepository courseTeachRepository;
    @Autowired
    private CourseRegistrationService courseRegistrationService;

    @Autowired
    private CourseTeachService courseTeachService;

    @PostMapping("/listsv")
    public String getListSV(Model model) {
        List<StudentEntity> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "listsv";
    }

    @PostMapping("/listgv")
    public String getListGV(Model model) {
        List<TeacherEntity> teachers = teacherRepository.findAll();
        model.addAttribute("teachers",teachers);
        return "listgv";
    }

    @PostMapping("/list_dkmhsv_all")
    private String getList_dkmhsvALL(Model model){
        List<CourseRegistrationEntity> courseRegistrations = courseRegistrationRepository.findAll();
        model.addAttribute("courseRegistrations",courseRegistrations);
        return "list_dkmhsv";
    }

    @PostMapping("/list_dkmhgv_all")
    private String getList_dkmhgvALL(Model model){
        List<CourseTeachEntity> courseTeachs = courseTeachRepository.findAll();
        model.addAttribute("courseTeachs",courseTeachs);
        return "list_dkmhgv";
    }

    @PostMapping("/listdksv/{maSV}")
    public String getListDKSV(@PathVariable String maSV, Model model){
        List<CourseRegistrationEntity> courseRegistrations = courseRegistrationService.getListDKByMaSV(maSV);
        model.addAttribute("courseRegistrations",courseRegistrations);
        return "list_dkmhsv";
    }

    @PostMapping("/listdkgv/{maGV}")
    public String getListDKGV(@PathVariable String maGV, Model model){
        List<CourseTeachEntity> courseTeachs = courseTeachService.getListDKByMaGV(maGV);
        model.addAttribute("courseTeachs",courseTeachs);
        return "list_dkmhgv";
    }



}




