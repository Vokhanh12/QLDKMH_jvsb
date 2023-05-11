package com.example.demo.Service;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void deleteRecordById(Long id) {
        studentRepository.deleteById(id);
    }

    public Optional<StudentEntity> findById(Long id){
        return  studentRepository.findById(id);
    }

}
