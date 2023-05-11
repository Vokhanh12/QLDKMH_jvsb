package com.example.demo.Service;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.Entity.TeacherEntity;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public void deleteRecordById(Long id) {
        teacherRepository.deleteById(id);
    }

    public Optional<TeacherEntity> findById(Long id){
        return  teacherRepository.findById(id);
    }

}