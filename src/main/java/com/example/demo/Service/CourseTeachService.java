package com.example.demo.Service;

import com.example.demo.Entity.CourseTeachEntity;
import com.example.demo.Repository.CourseTeachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseTeachService {
    @Autowired
    private CourseTeachRepository courseTeachRepository;

    public List<CourseTeachEntity> getListDKByMaGV(String maGV) {
        return courseTeachRepository.findByMaGV(maGV);
    }
}
