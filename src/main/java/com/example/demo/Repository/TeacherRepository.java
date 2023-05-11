package com.example.demo.Repository;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.Entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {
}
