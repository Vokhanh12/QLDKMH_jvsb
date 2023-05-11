package com.example.demo.Repository;

import com.example.demo.Entity.CourseTeachEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseTeachRepository extends JpaRepository<CourseTeachEntity, Long> {

    List<CourseTeachEntity> findByMaGV(String maGV);


}
