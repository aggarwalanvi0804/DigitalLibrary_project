package com.example.DigitalLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DigitalLibrary.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    // select * from author where email = ?
    Author findByEmail(String email);
}
