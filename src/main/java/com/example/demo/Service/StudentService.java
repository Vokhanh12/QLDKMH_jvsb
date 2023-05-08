package com.example.demo.Service;

import com.example.demo.Entity.StudentEnity;
import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {
    @Autowired
    private StudentRepository studentRepository;



    public void addTeacher(String maSV, String tenSV) {
        StudentEnity studentEnity= new StudentEnity();
        studentEnity.setMasv(maSV);
        studentEnity.setTensv(maSV);
        studentRepository.save(studentEnity);
    }
}
