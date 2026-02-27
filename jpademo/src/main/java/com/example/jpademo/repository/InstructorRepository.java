package com.example.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpademo.entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
