package com.example.demo.Repository;

import com.example.demo.Entity.CourseRegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRegistrationRepository extends JpaRepository<CourseRegistrationEntity, Long> {

    List<CourseRegistrationEntity> findByMaSV(String maSV);


}
