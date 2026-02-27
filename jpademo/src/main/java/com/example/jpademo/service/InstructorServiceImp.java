package com.example.jpademo.service;

import java.util.List;

import com.example.jpademo.entity.Instructor;
import com.example.jpademo.exception.InstructorNotFoundException;
import com.example.jpademo.repository.InstructorRepository;

public class InstructorServiceImp implements InstructorService {

    private final InstructorRepository repository;

    public InstructorServiceImp(InstructorRepository repository) {
        this.repository = repository;
    }


    @Override
    public Instructor saveInstructor(Instructor i) {
        // TODO Auto-generated method stub
       return this.repository.save(i);
    }

    @Override
    public List<Instructor> getAllInstructors() {
        // TODO Auto-generated method stub
        return this.repository.findAll();
    }

    @Override
    public Instructor getInstructorbyId(Long id) {
        // TODO Auto-generated method stub
        return this.repository.findById(id).orElseThrow(() -> new InstructorNotFoundException(id));
    }

    @Override
    public void deleteInstructor(Long id) {
        // TODO Auto-generated method stub
        this.repository.deleteById(id);
    }

}
