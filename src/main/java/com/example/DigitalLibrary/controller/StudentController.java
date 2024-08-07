package com.example.DigitalLibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.DigitalLibrary.dto.CreateStudentRequest;
import com.example.DigitalLibrary.dto.UpdateStudentRequest;
import com.example.DigitalLibrary.model.Student;
import com.example.DigitalLibrary.service.StudentService;

import javax.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("")
    public Student createStudent(@RequestBody @Valid CreateStudentRequest createStudentRequest){
        return studentService.create(createStudentRequest);
    }


    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable("studentId") int studentId){
        return studentService.get(studentId);
    }

    @DeleteMapping("")
    public Student deleteStudent(@RequestParam("id") int studentId){
        return studentService.delete(studentId);
    }

    // College example
    // student --> department
    // student --> course


    // Digital library
    // book --> author // in the beginning
    // book --> student // via txns



    @PutMapping("/{studentId}")
    public Student Student(@PathVariable("studentId") int studentId, @RequestBody @Valid UpdateStudentRequest updateStudentRequest){
        return studentService.update(studentId, updateStudentRequest);
    }
}
