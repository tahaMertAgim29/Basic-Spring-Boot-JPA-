package com.example.jpademo.exception;

public class DepartmentNotValidException extends RuntimeException {

    public DepartmentNotValidException(Long id) {
        super("Department not found with id: " + id);
    }
}
