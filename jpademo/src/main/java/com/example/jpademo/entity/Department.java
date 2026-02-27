package com.example.jpademo.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Instructor> instructors = new ArrayList<>();


    public Department() { }
    public Department(String name) {
        this.name = name;
    }

    public void addStudent(Student s) {
        students.add(s);
        s.setDepartment(this);
    }
    public void removeStudent(Student s) {
        students.remove(s);
        s.setDepartment(null);
    }
    public void addInstructor(Instructor i) {
        instructors.add(i);
        i.setDepartment(this);
    }
    public void removeInstructor(Instructor i) {
        instructors.remove(i);
        i.setDepartment(null);
    }

    public void setName(String name) {this.name = name;}
    public String getName() {return this.name;}

    public List<Student> getStudents() { return this.students; }

    public Long getId() {return this.id; }
}
