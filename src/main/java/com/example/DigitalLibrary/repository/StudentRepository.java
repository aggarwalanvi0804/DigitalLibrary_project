package com.example.DigitalLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DigitalLibrary.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
