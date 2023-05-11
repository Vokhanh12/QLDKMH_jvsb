package com.example.demo.Service;

import com.example.demo.Entity.CourseRegistrationEntity;
import com.example.demo.Repository.CourseRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseRegistrationService {
    @Autowired
    private CourseRegistrationRepository courseRegistrationRepository;

    public List<CourseRegistrationEntity> getListDKByMaSV(String maSV) {
        return courseRegistrationRepository.findByMaSV(maSV);
    }
}
