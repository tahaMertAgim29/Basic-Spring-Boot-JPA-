package com.example.jpademo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpademo.entity.Student;
import com.example.jpademo.service.StudentService;

import jakarta.validation.Valid;

import java.util.*;


@RestController
@RequestMapping("/api")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/students")
    public List<Student> printAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student displayStudent(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @GetMapping("/students/by-department/{id}")
    public List<Student> displayStudentById(@PathVariable Long id) {
        return service.getStudentsByDepartmentId(id);
    }


    @PostMapping("/students")
    @ResponseStatus(HttpStatus.CREATED)
    public Student saveStudent(@Valid @RequestBody Student student) {
        return service.saveStudent(student);
    }
    
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
    }
}
