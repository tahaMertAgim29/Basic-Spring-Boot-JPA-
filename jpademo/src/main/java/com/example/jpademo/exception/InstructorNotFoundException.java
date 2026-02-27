package com.example.jpademo.exception;

public class InstructorNotFoundException extends RuntimeException {

    public InstructorNotFoundException(Long id) {
        super("Instructor not found by id: " + id);
    }
}
