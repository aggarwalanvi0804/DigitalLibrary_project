package com.example.DigitalLibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DigitalLibrary.model.Author;
import com.example.DigitalLibrary.service.AuthorService;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping("/author/all")
    public List<Author> getAuthors(){
        return authorService.findAll();
    }
}
