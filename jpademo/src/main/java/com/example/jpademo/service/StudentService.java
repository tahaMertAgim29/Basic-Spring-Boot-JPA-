package com.example.jpademo.service;

import com.example.jpademo.entity.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);
    
    List<Student> getAllStudents();

    Student getStudentById(Long id);

    void deleteStudent(Long id);

    List<Student> getStudentsByDepartmentId(Long departmentId);

}
