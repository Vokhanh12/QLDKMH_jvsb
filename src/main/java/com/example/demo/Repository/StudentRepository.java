package com.example.demo.Repository;

import com.example.demo.Entity.StudentEnity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<StudentEnity, Long> {
}
