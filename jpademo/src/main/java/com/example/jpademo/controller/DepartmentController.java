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

import com.example.jpademo.entity.Department;
import com.example.jpademo.exception.DepartmentNotValidException;
import com.example.jpademo.repository.DepartmentRepository;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    private final DepartmentRepository repository;

    public DepartmentController(DepartmentRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/departments")
    @ResponseStatus(HttpStatus.CREATED)
    public Department saveDepartment(@RequestBody Department department) {
        return this.repository.save(department);
    }

    @DeleteMapping("/departments/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        this.repository.deleteById(id);
    }

    @GetMapping("/departments/{id}")
    public Department displayDepartment(@PathVariable Long id) {

        return repository.findById(id).orElseThrow(() -> new DepartmentNotValidException(id));
    }    

}
