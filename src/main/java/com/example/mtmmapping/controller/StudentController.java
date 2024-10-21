package com.example.mtmmapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mtmmapping.entity.Student;
import com.example.mtmmapping.repository.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    
    @Autowired
    StudentRepository studentRepository;

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
