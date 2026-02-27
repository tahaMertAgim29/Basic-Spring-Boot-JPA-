package com.example.jpademo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.jpademo.entity.Student;
import com.example.jpademo.exception.StudentNotFoundException;
import com.example.jpademo.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImp(StudentRepository repository) {
        this.repository = repository;
    }


    @Override
    public Student saveStudent(Student student) {
        // TODO Auto-generated method stub
        return repository.save(student);
       
    }

    @Override
    public List<Student> getAllStudents() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        // TODO Auto-generated method stub
        return repository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
        
    }

    @Override
    public void deleteStudent(Long id) {
        // TODO Auto-generated method stub
        repository.deleteById(id);
        
    }


    @Override
    public List<Student> getStudentsByDepartmentId(Long departmentId) {
        // TODO Auto-generated method stub
        return repository.findByDepartmentId(departmentId);
    }
    
}
