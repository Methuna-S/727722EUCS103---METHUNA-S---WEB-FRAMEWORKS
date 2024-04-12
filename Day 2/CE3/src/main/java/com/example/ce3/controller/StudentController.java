package com.example.ce3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce3.model.Student;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getInfo() {
        return new Student(1193, "Felix", "Not this guy !!");
    }

}
