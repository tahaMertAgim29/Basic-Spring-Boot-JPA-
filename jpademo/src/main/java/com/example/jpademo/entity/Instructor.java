package com.example.jpademo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    public Instructor() { }

    public Instructor(String name, String email, Department department) {
        this.name = name;
        this.email = email.toLowerCase();
        this.department = department;
    }

    public void setName(String name) {this.name = name;}
    public void setEmail(String email) {this.email = email.toLowerCase();}
    public void setDepartment(Department department) {this.department = department;}
    public String getName() {return this.name;}
    public String getEmail() {return this.email;}
    public Department getDepartment() {return this.department;}
}
