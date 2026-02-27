package com.example.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpademo.entity.Student;
import java.util.List;



public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByDepartmentId(Long departmentId);
}
