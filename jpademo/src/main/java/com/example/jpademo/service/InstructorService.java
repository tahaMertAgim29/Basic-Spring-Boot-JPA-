package com.example.jpademo.service;

import java.util.List;

import com.example.jpademo.entity.Instructor;

public interface InstructorService {

    Instructor saveInstructor(Instructor i);

    List<Instructor> getAllInstructors();

    Instructor getInstructorbyId(Long id);

    void deleteInstructor(Long id);

    
    
}
